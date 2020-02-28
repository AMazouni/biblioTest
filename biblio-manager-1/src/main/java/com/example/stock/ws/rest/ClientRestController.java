package com.example.stock.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.bean.Client;
import com.example.stock.service.facade.ClientService;

@RestController
@RequestMapping("biblio-api/Client")
public class ClientRestController {
	@Autowired
private ClientService clientService;
 @GetMapping("/cin/{cin}")
	public Client findByCin( @PathVariable String cin) {
		return clientService.findByCin(cin);
	}
}