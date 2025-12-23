package com.univ.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.univ.entities.Employee;

public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	// Setter Injection
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// Insert Product
	@Transactional
	public int insert(Employee employee) {
		Integer i = (Integer) hibernateTemplate.save(employee);
		return i;
	}

	// ✅ Corrected: Get single product
	public Employee getProduct(int empId) {
		return this.hibernateTemplate.get(Employee.class, empId);
	}

	// Get All Products
	public List<Employee> getAllEmployee() {
		return this.hibernateTemplate.loadAll(Employee.class);
	}

	// Delete Product
	@Transactional
	public void deleteEmployee(int empId) {
		Employee employee = this.hibernateTemplate.get(Employee.class, empId);
		this.hibernateTemplate.delete(employee);
	}

	// Update Product
	@Transactional
	public void updateEmployee(Employee employee) {
	    this.hibernateTemplate.update(employee);
	}

}
