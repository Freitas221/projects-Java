package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=== TEST 1: seller insert ===");	
		Department dep = new Department(null, "gourmet");
		departmentDao.insert(dep);	
		System.out.println("Id inserido: " + dep.getId());
		
		
		System.out.println("=== TEST 2: seller update ===");	
		Department dep1 = new Department(6, "cleaning");
		departmentDao.update(dep1);
		
		System.out.println("=== TEST 3: seller delete ===");
		System.out.println();
		System.out.println("Digite o id que deseja deletar: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		
		
		
		sc.close();
		
	}

}
