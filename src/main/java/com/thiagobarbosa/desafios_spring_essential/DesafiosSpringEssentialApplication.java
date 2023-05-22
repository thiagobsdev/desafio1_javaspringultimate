package com.thiagobarbosa.desafios_spring_essential;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thiagobarbosa.desafios_spring_essential.entities.Order;
import com.thiagobarbosa.desafios_spring_essential.services.OrderService;

@SpringBootApplication
public class DesafiosSpringEssentialApplication implements CommandLineRunner {
	
	@Autowired
	OrderService orderService;
	

	
	public static void main(String[] args) {
		SpringApplication.run(DesafiosSpringEssentialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		
		Order order1 = new Order(2282, 800.0, 10.0);
		
		Integer pedido = order1.getCode();
		String valor = String.format("%.2f", orderService.total(order1));
		

		System.out.println("Pedido código " + pedido  + "\n"
						+ "Valor total: R$ " + valor);
		
	}

}
