package com.example.stock.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.bean.Emprunt;
@Repository
public interface EmpruntDao extends JpaRepository<Emprunt, Long> {
public List<Emprunt> findByIsbnlivre(String isbnlivre);
public Emprunt findByReference(String reference);
public List<Emprunt> findByClientCin(String cin);

}
