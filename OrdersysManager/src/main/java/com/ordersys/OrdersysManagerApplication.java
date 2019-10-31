package com.ordersys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class OrdersysManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersysManagerApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "forward:list";
	}
}
