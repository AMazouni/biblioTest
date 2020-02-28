package com.example.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
public Client findByCin(String cin);
}
