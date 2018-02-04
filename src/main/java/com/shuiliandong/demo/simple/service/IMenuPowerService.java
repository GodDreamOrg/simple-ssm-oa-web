package com.shuiliandong.demo.simple.service;

import com.shuiliandong.demo.simple.model.MenuPowerMO;

import java.util.List;

public interface IMenuPowerService {

    List<MenuPowerMO> findByEmployeeNo(String employeeNo);
}
