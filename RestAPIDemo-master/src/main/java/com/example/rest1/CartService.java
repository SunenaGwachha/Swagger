package com.example.rest1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	
	
	@Autowired
	CartRepository cartRepository;
	
	public List<CartItem> getCartDetails() {
		return cartRepository.findAll();
	}

	public CartItem addCartDetails(CartItem cartItem) {
		return cartRepository.save(cartItem);
	}

	
	public void deleteCartItem(int id) {
		 cartRepository.deleteById(id);
	}

	
	
}
