package com.thiagobarbosa.desafios_spring_essential.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagobarbosa.desafios_spring_essential.entities.Order;


@Service
public class OrderService {
	
	
	@Autowired
	private ShippingService shippingService;
	
	
	public Double total ( Order order){
		
		double pedido = order.getBasic();
		double desconto = order.getDiscount() /100;
		double frete = shippingService.shipment(order);
		
		return  pedido - ( pedido * desconto) + frete;
		
	}

}
