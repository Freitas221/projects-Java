package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");	
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		sellerDao.findAll();
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller insert===");
		Seller newSeller = new Seller(null, "Lana ALves", "lana@gmail.com", new Date(), 2500.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Id inserido = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update===");
		Department department1 = new Department(2, null);
		Seller updateSeller = new Seller(9, "Lucas Oliveira", "lucas007@gmail.com", new Date(), 3500.0, department1);
		sellerDao.update(updateSeller);
		
		/*
		seller = sellerDao.findById(2);
		seller.setName("Maria Cabral");
		sellerDao.update(seller);
		
		If you want to update just one field	
		*/
		
		System.out.println("\n=== TEST 6: seller delete===");
		System.out.println("Digite o id que deseja deletar: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		sc.close();
	}

}

