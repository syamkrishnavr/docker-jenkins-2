package org.dxc.jenkin2.controll;


import org.dxc.jenkin2.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {


	@GetMapping("/getproduct")
	public Product getProductDetails() {
		Product p=new Product("laptope","electronics",10000,2);
		return p;
	}
}
