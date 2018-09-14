package com.nibi.springdata.idgenerators;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nibi.springdata.idgenerators.entities.Employee;
import com.nibi.springdata.idgenerators.repos.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdgeneratorsApplicationTests {

	@Autowired
	EmployeeRepository er;
	
	@Test
	public void contextLoads() {
	}

	
	
	@Test
	public void testCreadteEmployee() {
		
		Employee employee = new Employee();
//		employee.setId(123L);
		employee.setName("Nibi");
		
		er.save(employee);
		
		
		
		
	}
	
}
