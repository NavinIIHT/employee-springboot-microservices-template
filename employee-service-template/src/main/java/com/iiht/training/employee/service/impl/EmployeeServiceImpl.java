package com.iiht.training.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.employee.dto.EmployeeDto;
import com.iiht.training.employee.repository.EmployeeRepository;
import com.iiht.training.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeDto getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValidEmployee(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
