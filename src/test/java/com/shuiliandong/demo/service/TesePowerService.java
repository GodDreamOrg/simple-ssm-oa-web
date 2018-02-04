package com.shuiliandong.demo.service;

import com.alibaba.fastjson.JSON;
import com.shuiliandong.demo.simple.model.MenuPowerMO;
import com.shuiliandong.demo.simple.service.IMenuPowerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TesePowerService {

    @Autowired
    private IMenuPowerService menuPowerService;

    @Test
    public void test01(){
        List<MenuPowerMO> powerMOList = menuPowerService.findByEmployeeNo("SLD008");
        System.out.println(JSON.toJSONString(powerMOList));
    }
}
