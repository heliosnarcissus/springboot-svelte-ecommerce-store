package com.gofluent.shoppingcart.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Item implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
	private Integer itemID;
	private String itemName;
	private Float itemPrice;
	private Integer itemStockCount;
	private Float totalPricePerItem=0.02F;
	private Float totalPricePerBasket=0.02F;
	private int quantity=0;

}
