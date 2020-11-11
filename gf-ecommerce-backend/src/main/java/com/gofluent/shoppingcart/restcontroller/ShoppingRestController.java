package com.gofluent.shoppingcart.restcontroller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gofluent.shoppingcart.model.BasketItem;
import com.gofluent.shoppingcart.model.Item;
import com.gofluent.shoppingcart.model.ShoppingBasket;
import com.gofluent.shoppingcart.mybatis.mapper.IMyBatisMapper;
import com.gofluent.shoppingcart.service.ShoppingService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class ShoppingRestController {
	
		@Autowired
		ShoppingService shoppingService;	
		
		//refactor , because this just returns strings of primary keys , not actual objects
		@GetMapping(value="/listAllItemsInCart/{basketId}",produces = "application/json")
		@CrossOrigin( origins = "*", allowedHeaders = "*" )
		public List<String> listAllItemsInCart(@PathVariable(name="basketId") String basketId) {
			return shoppingService.selectAllItemInCart(basketId);
		}
		
		@GetMapping(value="/getItemById/{itemId}",produces = "application/json")
		@CrossOrigin(origins = "*", allowedHeaders = "*")
		public Item selectItemById(@PathVariable(name="itemId") Integer itemId){
			return shoppingService.selectItemById(itemId);
		}

		@CrossOrigin(origins = "*", allowedHeaders = "*")
		@PostMapping(value="/newItem", consumes = "application/json", produces = "application/json")
		public int insertNewItem(@RequestBody BasketItem basketItem) {
			return shoppingService.insertNewItem(basketItem);
		}
		
		
		@CrossOrigin(origins = "*", allowedHeaders = "*")
		@DeleteMapping(value="/item/{id}")
		public int removeItemById(@PathVariable(name="id") Integer itemId) {
			return shoppingService.removeItemById(itemId);
		}
		
		@CrossOrigin(origins = "*", allowedHeaders = "*")
		@PostMapping(value="/newBasket", consumes = "application/json", produces = "application/json")
		public int createNewBasket(@RequestBody ShoppingBasket basket) {
			System.out.print(basket.getBasketHolder()+basket.getBasketID());;
			
			return shoppingService.createNewBasket(basket);
		}
		
		@GetMapping(value="/getLastUser",produces = "application/json")
		@CrossOrigin(origins = "*", allowedHeaders = "*")
		public ShoppingBasket getLastUser(){	
			System.out.println("getLastUser called..");
			return shoppingService.getLatestUser();
		}

		@GetMapping(value="/retrieveItem/{itemId}",produces = "application/json")
		@CrossOrigin(origins = "*", allowedHeaders = "*")
		public Item retrieveItemFromDB(@PathVariable(name="itemId") String itemId){
			
			return shoppingService.retrieveItemFromDB(itemId);
		}
		
		@GetMapping(value="/fetchAllItemObjects/{basketId}",produces = "application/json")
		@CrossOrigin(origins = "*", allowedHeaders = "*")
		public List<Item> fetchAllItemObjjects(@PathVariable(name="basketId") String basketId){
			
			List<String> primaryKeys = shoppingService.selectAllItemInCart(basketId);
			return shoppingService.getAllItemObjects(primaryKeys);
		}
		
}















