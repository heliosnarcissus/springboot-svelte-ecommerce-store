package com.gofluent.shoppingcart.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gofluent.shoppingcart.model.BasketItem;
import com.gofluent.shoppingcart.model.Item;
import com.gofluent.shoppingcart.model.ShoppingBasket;
import com.gofluent.shoppingcart.mybatis.mapper.IMyBatisMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {
	
	@Autowired
	IMyBatisMapper shoppingServiceMapper;
	
	//this only returns their Primary Keys. return a list of PKs
	public List<String> selectAllItemInCart(String basketId){
		return shoppingServiceMapper.selectAllItemInCart(basketId);
	}
	
	public Item selectItemById(Integer itemId){
		return shoppingServiceMapper.selectItemById(itemId);
	}


	public int insertNewItem( BasketItem basketItem) {
		 shoppingServiceMapper.insertNewItem(basketItem);
		 return 200;
	}
	
	public int removeItemById(Integer itemId) {
		 shoppingServiceMapper.removeItemById(itemId);
		 return 200;
	}
	
	public int createNewBasket(ShoppingBasket basket) {
		shoppingServiceMapper.createNewBasket(basket);
		return 200;
	}
	
	public ShoppingBasket getLatestUser() {
		ShoppingBasket sb = new ShoppingBasket();
		sb = shoppingServiceMapper.selectLatestUser();
		return sb;
	}
	
	public Item retrieveItemFromDB(String itemId) {
		return shoppingServiceMapper.retrieveItemFromDB(itemId);
	}
	
	//this will fetch actual objects and pass to frontend
	public List<Item> getAllItemObjects(List<String> primaryKeys){
		
		 List<Item> itemObjectList = new ArrayList<>();
		 Map<Item,Integer> itemObjectsMap = new HashMap<>();
		 Item itemObject = new Item();
		 Float totalPricePerItem = 0.2F;
		 Float totalPriceWholeBasket = 0.2F;
		 String primaryKey = "";
		 Integer objCounter = 0;
		 
		 for(int i=0; i< primaryKeys.size(); i++){		 
			 primaryKey = primaryKeys.get(i) ;
			 itemObject =shoppingServiceMapper.retrieveItemFromDB(primaryKey ) ;
			 
			 objCounter = itemObjectsMap.get( itemObject );
			 if( objCounter ==null  ) {
				 objCounter = 0;
			 }
			 itemObjectsMap.put( itemObject , ++objCounter);	 
		 }
		 //set Total Price Per Item , set Total Quantity Per Item
		 for(Map.Entry< Item,Integer> entry: itemObjectsMap.entrySet()) {
			 	entry.getKey().setQuantity(entry.getValue());
			 	itemObjectList.add(entry.getKey());	 	
			 	totalPricePerItem =  entry.getKey().getItemPrice() * entry.getValue() ;	 			
			 	entry.getKey().setTotalPricePerItem( totalPricePerItem );
			 	totalPriceWholeBasket = totalPriceWholeBasket +  entry.getKey().getTotalPricePerItem();
		 }	 
		//set Total Price Per Item , set Total Quantity Per Item
		 for(Map.Entry< Item,Integer> entry: itemObjectsMap.entrySet()) { 		
			 	entry.getKey().setTotalPricePerBasket(totalPriceWholeBasket);
		 }	 
		 
		 return itemObjectList;
	}
	
	/*public Float getTotalPurchasePrice() {
		
		
		 List<Item> itemObjectList = new ArrayList<>();
		 itemObjectList =getAllItemObjects();
	}*/
	
	
	
	/*public List<Item> readJSONFile() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		//JSONObject jsonObject = new JSONObject();
		InputStream input = null;
		try {
			input = new FileInputStream("/resources/Heroes.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		List<Item> itemList = objectMapper.readValue(input, Item.class);
	
		return itemList;
	}*/
	
}	
