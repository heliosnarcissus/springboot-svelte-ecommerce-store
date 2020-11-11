 package com.gofluent.shoppingcart.mybatis.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

import com.gofluent.shoppingcart.model.BasketItem;
import com.gofluent.shoppingcart.model.Item;
import com.gofluent.shoppingcart.model.ShoppingBasket;

@Mapper
public interface IMyBatisMapper {
	
	public List<String> selectAllItemInCart(String basketId);
	public Item selectItemById(Integer itemId);
	public Item addItem(Item item);
	public Integer insertNewItem(BasketItem basketItem);
	public Integer removeItemById(Integer itemId);
	
	public Integer createNewBasket(ShoppingBasket basket);
	
	public ShoppingBasket selectLatestUser();
	
	public Item retrieveItemFromDB(String itemId );
		
}
