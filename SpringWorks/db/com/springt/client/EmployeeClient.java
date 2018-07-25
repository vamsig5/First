package com.springt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springt.entity.Employee;
import com.springt.interfaces.IEmployeeDAO;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("db-context.xml");
		IEmployeeDAO employeeDAO=(IEmployeeDAO)context.getBean("employeeDao");
		Employee emp1=new Employee(103, "hanu", 6000);
		//employeeDAO.insertEmployee(emp1);
 // System.out.println(employeeDAO.getEmployee(101));
		//System.out.println(employeeDAO.getAllEmps());
		employeeDAO.deleteEmployee(104);
		
	}

}
