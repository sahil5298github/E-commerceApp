package com.main;

import java.util.Scanner;

import com.products.InsertProducts;
import com.products.Products;
import com.products.SelectProduct;
import com.products.ViewAllProducts;
import com.users.InsertUser;
import com.users.SelectUser;
import com.users.UserLogin;
import com.users.Users;

public class MainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		System.out.println("Enter Product Details");
//		System.out.println("Product Name");
//		String name = s.nextLine();
//		System.out.println("Product Description");
//		String desc = s.nextLine();
//		System.out.println("Product Price");
//		double price = s.nextDouble();
//		System.out.println("Product Quantity");
//		int quantity = s.nextInt();
//
//		Products prod = new Products();
//		prod.setName(name);
//		prod.setDesc(desc);
//		prod.setPrice(price);
//		prod.setQuantity(quantity);
//
//		InsertProducts insertProd = new InsertProducts();
//		insertProd.insertProdDetails(prod.getName(), prod.getDesc(), prod.getPrice(), prod.getQuantity());

//		System.out.println("Enter Product Id ");
//		int id = s.nextInt();
//		SelectProduct prod = new SelectProduct();
//		prod.selectProdDetails(id);

//		System.out.println("Enter Users Details");
//		System.out.println("Fist Name");
//		String firstName = s.nextLine();
//		System.out.println("Last Name");
//		String lastName = s.nextLine();
//		System.out.println("User Name");
//		String userName = s.nextLine();
//		System.out.println("Password");
//		String pass = s.nextLine();
//		System.out.println("City");
//		String city = s.nextLine();
//		System.out.println("Email");
//		String email = s.nextLine();
//		System.out.println("Mobile Number");
//		long moNum = s.nextLong();
//
//		Users user = new Users();
//		user.setFirstName(firstName);
//		user.setLastName(lastName);
//		user.setUserName(userName);
//		user.setPass(pass);
//		user.setCity(city);
//		user.setEmail(email);
//		user.setMoNum(moNum);
//
//		InsertUser insertUser = new InsertUser();
//		insertUser.insertUserDetails(user.getFirstName(), user.getLastName(), user.getUserName(), user.getPass(),
//				user.getCity(), user.getEmail(), user.getMoNum());

//		System.out.println("Enter User Id");
//		int id = s.nextInt();
//		SelectUser selUser = new SelectUser();
//		selUser.selectUserDetails(id);

//		SelectProduct prod = new SelectProduct();
//		System.out.println("Enter product id");
//		int id = s.nextInt();
//		prod.selectProdDetails(id);

//		SelectUser user = new SelectUser();
//		System.out.println("Enter user Id");
//		int id = s.nextInt();
//		user.selectUserDetails(id);

		System.out.println("1 : User Registration \t 2 : User Login \t 3: View Products ");
		System.out.println("Enter Your Choice");
		int input = s.nextInt();
		switch (input) {
		case 1:
			InsertUser user = new InsertUser();
			user.userRegistration();
			break;
		case 2:
			UserLogin userLogin = new UserLogin();
			System.out.println("Enter User Name");
			String userName = s.next();
			System.out.println("Enter Password");
			String pass = s.next();
			userLogin.userLogin(userName, pass);
			break;
		case 3:
			System.out.println("Products Details Are : ");
			ViewAllProducts prod = new ViewAllProducts();
			prod.viewAllProducts();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}

	}
}
