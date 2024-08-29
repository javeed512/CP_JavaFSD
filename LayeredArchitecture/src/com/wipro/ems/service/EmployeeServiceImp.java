package com.wipro.ems.service;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.wipro.ems.dao.EmployeeDaoImp;
import com.wipro.ems.dao.IEmployeeDAO;
import com.wipro.ems.pojo.Employee;

public class EmployeeServiceImp implements IEmployeeService {

	private IEmployeeDAO dao;
	
			
	
	Logger logger =		Logger.getLogger(EmployeeServiceImp.class);
	
	

	public EmployeeServiceImp() {
		
		logger.setLevel(Level.ALL);
		
			logger.info("EmployeeService object created...");
			
		

		dao = new EmployeeDaoImp();

	}

	@Override
	public int addEmployee(Employee emp) {
		
		logger.info("add service called..");

		return dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) {

		return dao.updateEmployee(emp);
	}

	@Override
	public int deleteEmployeeById(int eid) {

		return dao.deleteEmployeeById(eid);
	}

	@Override
	public Employee selectEmployeeById(int eid) {

		return dao.selectEmployeeById(eid);
	}

	@Override
	public List<Employee> selectAll() {

		return dao.selectAll();
	}

}
