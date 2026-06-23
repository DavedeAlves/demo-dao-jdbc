package model.dao.impl;

import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

import java.util.List;

public class SellerDaoJDBC implements SellerDao {


    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
