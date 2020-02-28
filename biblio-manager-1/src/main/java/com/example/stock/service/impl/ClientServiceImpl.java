package com.example.stock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.bean.Client;
import com.example.stock.dao.ClientDao;
import com.example.stock.service.facade.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;

	@Override
	public Client findByCin(String cin) {
		return clientDao.findByCin(cin);
	}

}
