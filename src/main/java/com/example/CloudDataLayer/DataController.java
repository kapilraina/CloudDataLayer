package com.example.CloudDataLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	private static Logger log = LoggerFactory.getLogger(DataController.class);
	private Map<Long, Cart> carts = new HashMap<Long, Cart>();

	@RequestMapping(path = "/cart/{id}")
	@ResponseBody
	public Cart getCartById(@PathVariable("id") long id) {
		log.info("Returning Cart For " + id);
		return carts.get(id);
	}

	@RequestMapping(path = "/cart/1")
	public String high() {
		return "LUDWIG";
	}

	@RequestMapping(path = "/cart/2")
	public String low() {
		return "BHOR";
	}

	@RequestMapping(path = "/cart/r")
	public ResponseEntity<String> redirect() {
		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.FOUND);
		
		
		return response;
	}

	@PostConstruct
	public void postconstruct() {
		Cart c1 = new Cart();
		Product p1 = new Product();
		p1.setCategory("Alladin's Carpet");
		p1.setCheckoutprice(40.00);
		p1.setId("P1000");
		p1.setName("9x10 Carpet");
		p1.setQuantity(1);
		p1.setSaleprice(45.00);
		p1.setTotal(45.00);

		List<Product> products = new ArrayList<Product>();
		products.add(p1);

		c1.setCarttotal(45.00);
		c1.setId(1000);
		c1.setProducts(products);

		carts.put(1000L, c1);

	}
}
