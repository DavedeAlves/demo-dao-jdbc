package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entites.Department;
import model.entites.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findByID ===");

        Seller seller = sellerDao.findById(1);

        System.out.println(seller);

        System.out.println("=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id = "+newSeller.getId());

        System.out.println("=== TEST 5: seller update ===");
        sellerDao.findById(1);
        seller.setName("Marcus Winchester");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("=== TEST 6: seller delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");


        sc.close();
    }
}