package com.main;

import java.util.Scanner;

import com.products.CalculateBill;
import com.products.CheckProdQuantity;
import com.products.DisplayAmount;
import com.products.InsertProducts;

import com.products.ViewAllProducts;
import com.products.ViewCard;
import com.users.InsertUser;
import com.users.SelectAllUsers;

import com.users.UserLogin;

public class MainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to E-Commerse Based Application");
		for (int i = 1; i <= 5; i++) {
			System.out.println(" 1-User Operation\n 2-Admin Operation\n 3-Guest Operation\n 4-Exit");
			int input = s.nextInt();
			int input1 = input;

			switch (input) {
			case 1: {
				System.out.println("Select User Operations");
				System.out.println(" 1 : User Registration\n 2 : User Login\n 3 : view Products");
				int user1 = s.nextInt();

				switch (user1) {
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
					System.out.println("Inter Valid Input");
					break;
				}
			}
				break;
			case 2: {
				System.out.println("Select Admin Operations");
				System.out.println(
						" 1 : Add product item\n 2 : Calculate Bill\n 3 : Display amount to End User\n 4 : Check Quantity\n 5 : Check registered user");
				int product1 = s.nextInt();
				switch (product1) {
				case 1:
					InsertProducts insertProducts = new InsertProducts();
					System.out.println("Enter Product Details");
					System.out.println("Name : ");
					String name = s.next();
					System.out.println("Description : ");
					String desc = s.next();
					System.out.println("Price : ");
					double price = s.nextDouble();
					System.out.println("Quantity : ");
					int quantity = s.nextInt();
					insertProducts.insertProdDetails(name, desc, price, quantity);
					break;
				case 2:
					CalculateBill calBill = new CalculateBill();
					System.out.println("Enter Product Id ");
					int id = s.nextInt();
					calBill.calculateProdBill(id);
					break;
				case 3:
					DisplayAmount amt = new DisplayAmount();
					System.out.println("Enter Product Id");
					int id1 = s.nextInt();
					amt.displayAmount(id1);
					break;
				case 4:
					CheckProdQuantity quantity1 = new CheckProdQuantity();
					System.out.println("Enter Product Id");
					int prodId = s.nextInt();
					quantity1.checkProdQuantity(prodId);
					break;
				case 5:
					SelectAllUsers user = new SelectAllUsers();
					user.selectUserDetails();
					break;
				default:
					System.out.println("Enter Valid Input.");
					break;
				}
				break;
			}
			case 3: {
				System.out.println("Select Guest Operations");
				System.out.println(" 1 : View product item");
				int guest1 = s.nextInt();
				switch (guest1) {
				case 1:
					ViewAllProducts prod = new ViewAllProducts();
					prod.viewAllProducts();
					break;
				default:
					System.out.println("Enter Valid Input");
					break;
				}
			}
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}

}
