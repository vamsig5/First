package com.springt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springt.employee.Employee;
import com.springt.interfaces.IEmployeeDAO;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("db-context.xml");
		IEmployeeDAO employeeDAO=(IEmployeeDAO)context.getBean("employeeDao");
		Employee employee1=new Employee(101, "vamsi", 4500);
		Employee employee2=new Employee(102, "uma", 4200);
		Employee employee3=new Employee(103, "hanu", 5500);
		//employeeDAO.insertEmployee(employee2);

	}

}
