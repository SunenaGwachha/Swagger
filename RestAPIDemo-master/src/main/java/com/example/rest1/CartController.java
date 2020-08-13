package com.example.rest1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CartController {

	@Autowired
	CartService cartService;

	@GetMapping("/get")
	public List<CartItem> getCartDetails() {
		System.out.println("Inside getCartDetails");
		return cartService.getCartDetails();
	}

	@PostMapping("/add")
	public CartItem addCartDetails(@RequestBody CartItem cartItem) {
		System.out.println("@@@ Inside add");
		return cartService.addCartDetails(cartItem);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCartItem(@PathVariable int id) {
		System.out.println("hi :" + id);
		cartService.deleteCartItem(id);
	}
}
