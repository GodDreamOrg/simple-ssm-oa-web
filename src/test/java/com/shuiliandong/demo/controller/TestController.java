package com.shuiliandong.demo.controller;

import com.shuiliandong.demo.simple.controller.MainController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TestController {

    @Autowired
    private MainController controller;

    @Test
    public void test01(){
        ModelAndView modelAndView = controller.toLeft(null);
    }
}
