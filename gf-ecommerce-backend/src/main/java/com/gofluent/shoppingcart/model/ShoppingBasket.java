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
public class ShoppingBasket {

	@Id
    @GeneratedValue
	private Integer basketID;
	private String basketHolder;
    public int getBasketHolder() {
        return 0;
    }
    public int getBasketID() {
        return 0;
    }

}