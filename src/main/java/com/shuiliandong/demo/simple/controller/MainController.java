package com.shuiliandong.demo.simple.controller;

import com.alibaba.fastjson.JSON;
import com.shuiliandong.demo.simple.model.LeftMenuMO;
import com.shuiliandong.demo.simple.model.MenuPowerMO;
import com.shuiliandong.demo.simple.service.IMenuPowerService;
import com.shuiliandong.demo.simple.util.GenerateTreeNoteUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@RequestMapping("/main")
public class MainController {
    private static Logger logger = Logger.getLogger(MainController.class);

    @Autowired
    private IMenuPowerService menuPowerService;

    @RequestMapping("/index")
    public ModelAndView toIndex() {
        ModelAndView modelAndView = new ModelAndView("main/index");
        return modelAndView;
    }

    @RequestMapping("/left")
    public ModelAndView toLeft(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("main/left");

        LeftMenuMO leftMenuMO = new LeftMenuMO();
        GenerateTreeNoteUtil util = new GenerateTreeNoteUtil();
        List<LeftMenuMO.TreeNoteMO> list = util.getNoteAllForLevelAndNum(3, 5, 20);
        leftMenuMO.setResult(list);
        System.out.println(JSON.toJSONString(list));
        // TODO employeeNo 是从登陆信息里面取来的
        LeftMenuMO menuMO = getLeftMenuMO("SLD001");
        logger.info("menuMO :::>>> "+JSON.toJSONString(menuMO));
        modelAndView.addObject("result", menuMO);
        return modelAndView;
    }

    private LeftMenuMO getLeftMenuMO(String employeeNo) {
        LeftMenuMO leftMenuMO = new LeftMenuMO();

        List<MenuPowerMO> menuPowerMOList = menuPowerService.findByEmployeeNo(employeeNo);

        Map<Long, MenuPowerMO> map = new HashMap<Long, MenuPowerMO>();

        List<MenuPowerMO> result = new ArrayList<MenuPowerMO>();

        Iterator<MenuPowerMO> iterator = menuPowerMOList.iterator();
        while (iterator.hasNext()){
            MenuPowerMO mo = iterator.next();
            if (StringUtils.isEmpty(mo.getParentId())){
                map.put(mo.getId(), mo);
                iterator.remove();
            }

            MenuPowerMO powerMO = map.get(mo.getParentId());
            if (powerMO != null){
                List<MenuPowerMO> childList = powerMO.getChildList();
                if (childList==null) {
                    childList = new ArrayList<MenuPowerMO>();
                }
                childList.add(mo);
                powerMO.setChildList(childList);
                iterator.remove();
            }
        }

        result.addAll(map.values());

        leftMenuMO.setResult(transTreeNoteMOList(result));
        return leftMenuMO;
    }


    private List<LeftMenuMO.TreeNoteMO> transTreeNoteMOList(List<MenuPowerMO> menuPowerMOList) {
        List<LeftMenuMO.TreeNoteMO> result = new ArrayList<LeftMenuMO.TreeNoteMO>();

        if (CollectionUtils.isEmpty(menuPowerMOList)) return null;
        for (MenuPowerMO menuPowerMO : menuPowerMOList) {
            LeftMenuMO.TreeNoteMO temp = new LeftMenuMO.TreeNoteMO();
            temp.setDesc(menuPowerMO.getDesc());
            temp.setId(menuPowerMO.getId());
            temp.setName(menuPowerMO.getName());
            temp.setParentId(menuPowerMO.getParentId());
            temp.setShowName(menuPowerMO.getShowName());
            temp.setStatus(menuPowerMO.getStatus());
            temp.setType(menuPowerMO.getType());
            temp.setUrl(menuPowerMO.getUrl());
            temp.setChildList(transTreeNoteMOList(menuPowerMO.getChildList()));
            result.add(temp);
        }

        return result;
    }


}
