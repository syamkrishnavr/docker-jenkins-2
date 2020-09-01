package org.dxc.jenkin2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	public Product(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
	}
	private String productName;
	private String productCategory;
	private float price;
	private int quantity;
}
