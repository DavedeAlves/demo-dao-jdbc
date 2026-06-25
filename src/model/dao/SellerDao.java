package model.dao;

import model.entites.Department;
import model.entites.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Department obj);
    void update(Department  obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
