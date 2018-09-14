package com.nibi.springdata.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;

import com.nibi.springdata.idgenerators.entities.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
