package com.shuiliandong.demo.simple.Service;

import com.shuiliandong.demo.simple.entity.EmployeeInfoEntity;

public interface EmployeeInfoService {
	/**
	 * insert
	 */
	int insert(EmployeeInfoEntity employeeInfoEntity);
	/**
	 * 万能insert
	 */
	int insertSelective(EmployeeInfoEntity employeeInfoEntity);
	/**
	 * delete
	 */
	int deleteByPrimaryKey(Long id);
	/**
	 * 万能update
	 */
	int updateByPrimaryKeySelective(EmployeeInfoEntity employeeInfoEntity);
	/**
	 * update
	 */
	int updateByPrimaryKey(EmployeeInfoEntity employeeInfoEntity);
	/**
	 * select
	 */
	EmployeeInfoEntity selectByPrimaryKey(Long id);
}
