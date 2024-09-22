package com.evergent.ems.controller;

import com.evergent.sandeep.bean.ProductBean;
import com.evergent.sandeep.bean.UserBean;
import com.evergent.sandeep.bean.OrderBean;
import com.evergent.ems.service.EcommerceService;

import java.util.List;
import java.util.Scanner;

public class EcommerceMain {
	public static void main(String[] args) {
		EcommerceService service = new EcommerceService();
		Scanner scanner = new Scanner(System.in);

		UserBean loggedInUser = null;

		while (true) {
			System.out.println("\nWelcome to E-commerce System");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.println("Register New User");
				UserBean user = new UserBean();
				System.out.print("Enter Username: ");
				user.setUserName(scanner.nextLine());
				System.out.print("Enter Email: ");
				user.setEmail(scanner.nextLine());
				System.out.print("Enter Password: ");
				user.setPassword(scanner.nextLine());

				int registerResult = service.registerUser(user);
				if (registerResult > 0) {
					System.out.println("User Registered Successfully.");
				} else {
					System.out.println("Registration Failed.");
				}
				break;

			case 2:
				System.out.println("User Login");
				System.out.print("Enter Email: ");
				String email = scanner.nextLine();
				System.out.print("Enter Password: ");
				String password = scanner.nextLine();

				loggedInUser = service.loginUser(email, password);
				if (loggedInUser != null) {
					System.out.println("Login Successful.");
					break;
				} else {
					System.out.println("Invalid credentials. Try again.");
				}
				break;

			case 3:
				System.out.println("Goodbye!,have nice day");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}

			// User logged in section
			while (loggedInUser != null) {
				System.out.println("\nWelcome, " + loggedInUser.getUserName());
				System.out.println("1. Add Product (Admin Only)");
				System.out.println("2. View Products");
				System.out.println("3. Place Order");
				System.out.println("4. View Orders");
				System.out.println("5. View Transaction History");
				System.out.println("6. Display Invoice");
				System.out.println("7. Logout");
				System.out.println("8. Exit");
				System.out.print("Enter your choice: ");
				int userChoice = scanner.nextInt();
				scanner.nextLine(); // Consume newline

				switch (userChoice) {
				case 1: // Add Product
					System.out.print("Enter Product Name: ");
					String productName = scanner.next();
					System.out.print("Enter Product Price: ");
					double productPrice = scanner.nextDouble();
					System.out.print("Enter Product Stock: ");
					int productStock = scanner.nextInt();

					ProductBean newProduct = new ProductBean();
					newProduct.setProductName(productName);
					newProduct.setPrice(productPrice);
					newProduct.setStock(productStock);

					int result = service.addProduct(newProduct);
					if (result > 0) {
						System.out.println("Product added successfully.");
					} else {
						System.out.println("Failed to add product.");
					}
					break;

				case 2:
					System.out.println("Available Products:");
					List<ProductBean> products = service.viewProducts();
					for (ProductBean product : products) {
						System.out
								.println("Product ID: " + product.getProductId() + ", Name: " + product.getProductName()
										+ ", Price: Rs. " + product.getPrice() + ", Stock: " + product.getStock());
					}
					break;

				case 3:
					System.out.print("Enter Product ID: ");
					int productId = scanner.nextInt();
					System.out.print("Enter Quantity: ");
					int quantity = scanner.nextInt();

					ProductBean selectedProduct = null;
					List<ProductBean> productList = service.viewProducts();
					for (ProductBean product : productList) {
						if (product.getProductId() == productId) {
							selectedProduct = product;
							break;
						}
					}

					if (selectedProduct != null && selectedProduct.getStock() >= quantity) {
						double totalPrice = selectedProduct.getPrice() * quantity;
						OrderBean order = new OrderBean();
						order.setUserId(loggedInUser.getUserId());
						order.setProductId(selectedProduct.getProductId());
						order.setQuantity(quantity);
						order.setTotalPrice(totalPrice);

						int orderResult = service.placeOrder(order);
						if (orderResult > 0) {
							System.out.println("Order Placed Successfully. Total: Rs. " + totalPrice);
							service.updateStock(productId, selectedProduct.getStock() - quantity);
						} else {
							System.out.println("Order Failed.");
						}
					} else {
						System.out.println("Product not available or insufficient stock.");
					}
					break;

				case 4:
					System.out.println("Your Orders:");
					List<OrderBean> orders = service.viewOrders(loggedInUser.getUserId());
					for (OrderBean order : orders) {
						System.out.println("Order ID: " + order.getOrderId() + ", Product ID: " + order.getProductId()
								+ ", Quantity: " + order.getQuantity() + ", Total: Rs. " + order.getTotalPrice());
					}
					break;

				case 5: // View Transaction History
					List<OrderBean> transactionHistory = service.viewTransactionHistory(loggedInUser.getUserId());
					if (transactionHistory.isEmpty()) {
						System.out.println("No transaction history found.");
					} else {
						System.out.println("transaction history found.");
						for (OrderBean order : transactionHistory) {
							System.out
									.println("Order ID: " + order.getOrderId() + ", Product ID: " + order.getProductId()
											+ ", Quantity: " + order.getQuantity() + ", Total Price: Rs. "
											+ order.getTotalPrice() + ", Order Date: " + order.getOrderDate());
						}
					}
					break;
				case 6: // View DisplayInvoice
					List<OrderBean> displayInvoice = service.viewTransactionHistory(loggedInUser.getUserId());
					if (displayInvoice.isEmpty()) {
						System.out.println("No transaction history found.");
					} else {
						for (OrderBean order : displayInvoice) {
							System.out.println("Download Invoice");
							System.out.println("Order Date: "+order.getOrderDate());
							System.out.println("Order ID: "+order.getOrderId());
							System.out.println("Product ID: "+order.getOrderId());
							System.out.println("Quantity: "+order.getQuantity());
							System.out.println("Total Price: Rs: "+order.getTotalPrice());
							System.out.println();
						}
					}
					break;

				case 7:
					loggedInUser = null;
					System.out.println("Logged out successfully.");
					break;

				case 8:
					System.out.println("Goodbye!,have a nice day");
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice. Try again.");
					break;
				}
			}
		}
	}
	
}
