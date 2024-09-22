package com.evergent.sandeep.dao;

import com.evergent.sandeep.bean.ProductBean;
import com.evergent.sandeep.bean.UserBean;
import com.evergent.sandeep.bean.OrderBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EcommerceDAO {

	// Add a new product
	public int addProduct(ProductBean product) {
		try {
			Connection con = ECommerceDBConncection.getConnection();
			String query = "INSERT INTO products (productName, price, stock) VALUES (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, product.getProductName());
			pstmt.setDouble(2, product.getPrice());
			pstmt.setInt(3, product.getStock());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// View all products
	public List<ProductBean> getAllProducts() {
		List<ProductBean> products = new ArrayList<>();
		try {
			Connection con = ECommerceDBConncection.getConnection();
			String query = "SELECT * FROM products";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				ProductBean product = new ProductBean();
				product.setProductId(rs.getInt("productId"));
				product.setProductName(rs.getString("productName"));
				product.setPrice(rs.getDouble("price"));
				product.setStock(rs.getInt("stock"));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	// Update product stock
	public int updateProductStock(int productId, int stock) {
		try {
			Connection con = ECommerceDBConncection.getConnection();
			String query = "UPDATE products SET stock = ? WHERE productId = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, stock);
			pstmt.setInt(2, productId);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// Add a new user
	public int addUser(UserBean user) {
		try {
			Connection con = ECommerceDBConncection.getConnection();
			String query = "INSERT INTO users (userName, email, password) VALUES (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// Get a user by email and password
	public UserBean getUser(String email, String password) {
		try {
			Connection con = ECommerceDBConncection.getConnection();
			String query = "SELECT * FROM users WHERE email = ? AND password = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				UserBean user = new UserBean();
				user.setUserId(rs.getInt("userId"));
				user.setUserName(rs.getString("userName"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Add a new order
	public int addOrder(OrderBean order) {
		try {
			Connection con = ECommerceDBConncection.getConnection();
			String query = "INSERT INTO orders (userId, productId, quantity, totalPrice,orderDate) VALUES (?, ?, ?, ?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, order.getUserId());
			pstmt.setInt(2, order.getProductId());
			pstmt.setInt(3, order.getQuantity());
			pstmt.setDouble(4, order.getTotalPrice());
			pstmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// Get all orders for a specific user
	public List<OrderBean> getOrdersByUser(int userId) {
		List<OrderBean> orders = new ArrayList<>();
		try {
			Connection con = ECommerceDBConncection.getConnection();
			String query = "SELECT * FROM orders WHERE userId = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				OrderBean order = new OrderBean();
				order.setOrderId(rs.getInt("orderId"));
				order.setUserId(rs.getInt("userId"));
				order.setProductId(rs.getInt("productId"));
				order.setQuantity(rs.getInt("quantity"));
				order.setTotalPrice(rs.getDouble("totalPrice"));
				order.setOrderDate(rs.getTimestamp("orderDate"));
				orders.add(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
}
