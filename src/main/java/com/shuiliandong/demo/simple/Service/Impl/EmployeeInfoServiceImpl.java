package com.shuiliandong.demo.simple.service.Impl;

import com.shuiliandong.demo.simple.service.EmployeeInfoService;
import com.shuiliandong.demo.simple.dao.EmployeeInfoEntityMapper;
import com.shuiliandong.demo.simple.entity.EmployeeInfoEntity;
import org.springframework.stereotype.Service;

/**
 * @author v_hebo
 * @create 2018-02-04 20:05
 */
@Service("employeeInfoService")
public class EmployeeInfoServiceImpl implements EmployeeInfoService {

	public EmployeeInfoEntityMapper employeeInfoEntityMapper;

	public int insert(EmployeeInfoEntity employeeInfoEntity) {
		return employeeInfoEntityMapper.insert(employeeInfoEntity);
	}

	public int insertSelective(EmployeeInfoEntity employeeInfoEntity) {
		return employeeInfoEntityMapper.insertSelective(employeeInfoEntity);
	}

	public int deleteByPrimaryKey(Long id) {
		return employeeInfoEntityMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(EmployeeInfoEntity employeeInfoEntity) {
		return employeeInfoEntityMapper.updateByPrimaryKeySelective(employeeInfoEntity);
	}

	public int updateByPrimaryKey(EmployeeInfoEntity employeeInfoEntity) {
		return employeeInfoEntityMapper.updateByPrimaryKey(employeeInfoEntity);
	}

	public EmployeeInfoEntity selectByPrimaryKey(Long id) {
		return employeeInfoEntityMapper.selectByPrimaryKey(id);
	}
}
