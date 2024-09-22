package com.evergent.ems.service;

import com.evergent.sandeep.bean.ProductBean;
import com.evergent.sandeep.bean.UserBean;
import com.evergent.sandeep.bean.OrderBean;
import com.evergent.sandeep.dao.EcommerceDAO;

import java.util.List;

public class EcommerceService {
    EcommerceDAO ecommerceDAO = new EcommerceDAO();

    // Product Management
    public int addProduct(ProductBean product) {
        return ecommerceDAO.addProduct(product);
    }

    public List<ProductBean> viewProducts() {
        return ecommerceDAO.getAllProducts();
    }

    public int updateStock(int productId, int stock) {
        return ecommerceDAO.updateProductStock(productId, stock);
    }

    // User Management
    public int registerUser(UserBean user) {
        return ecommerceDAO.addUser(user);
    }

    public UserBean loginUser(String email, String password) {
        return ecommerceDAO.getUser(email, password);
    }

    // Order Management
    public int placeOrder(OrderBean order) {
        return ecommerceDAO.addOrder(order);
    }

    public List<OrderBean> viewOrders(int userId) {
        return ecommerceDAO.getOrdersByUser(userId);
    }
    public List<OrderBean> viewTransactionHistory(int userId) {
        return ecommerceDAO.getOrdersByUser(userId);
    }
}
