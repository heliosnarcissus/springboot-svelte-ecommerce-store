package com.gofluent.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gofluent.shoppingcart.model.Item;

@SpringBootApplication
public class BackendStartMain {

	public static void main(String[] args) {
		SpringApplication.run(BackendStartMain.class, args);
		
		System.out.println("Shopping Cart backend server is running..");

	}

}
