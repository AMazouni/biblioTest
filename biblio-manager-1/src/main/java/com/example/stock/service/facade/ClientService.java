package com.example.stock.service.facade;

import com.example.stock.bean.Client;

public interface ClientService {
	public Client findByCin(String cin);
}
