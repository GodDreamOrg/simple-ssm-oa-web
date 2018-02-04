package com.shuiliandong.demo.simple.service.Impl;

import com.alibaba.fastjson.JSON;
import com.shuiliandong.demo.simple.dao.PowerEntityMapper;
import com.shuiliandong.demo.simple.entity.PowerEntity;
import com.shuiliandong.demo.simple.model.MenuPowerMO;
import com.shuiliandong.demo.simple.service.IMenuPowerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("menuPowerService")
public class MenuPowerServiceImpl implements IMenuPowerService{

    @Autowired
    private PowerEntityMapper powerEntityMapper;

    public List<MenuPowerMO> findByEmployeeNo(String employeeNo) {
        List<PowerEntity> entityList = powerEntityMapper.findByEmployeeNo(employeeNo);

        List<MenuPowerMO> result = new ArrayList<MenuPowerMO>();

        for (PowerEntity entity:entityList) {
            MenuPowerMO menuPowerMO = new MenuPowerMO();
            BeanUtils.copyProperties(entity, menuPowerMO);
            result.add(menuPowerMO);
        }
        return result;
    }
}
