package com.course.spring.springcore.setter_injection.assignment;

import java.util.List;

public class ShoppingCart {

	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}
}
