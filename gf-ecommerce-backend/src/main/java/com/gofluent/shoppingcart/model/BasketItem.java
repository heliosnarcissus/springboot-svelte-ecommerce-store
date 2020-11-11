package com.gofluent.shoppingcart.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BasketItem {
	
	@Id
    @GeneratedValue
	private Integer basketItemID;

	private Integer itemID;
	private Integer basketID;
}
