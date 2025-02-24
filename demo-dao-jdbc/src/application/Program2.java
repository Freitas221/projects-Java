package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=== TEST 1: seller findById ===");	
		Department dep = new Department(null, "deposit");
		departmentDao.insert(dep);	
		System.out.println("Id inserido: " + dep.getId());
		
		
		System.out.println("=== TEST 2: seller findById ===");	
		Department dep1 = new Department(6, "cleaning");
		departmentDao.update(dep1);
		
	}

}
