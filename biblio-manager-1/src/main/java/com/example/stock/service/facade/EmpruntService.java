package com.example.stock.service.facade;

import java.util.Date;
import java.util.List;

import com.example.stock.bean.Emprunt;

public interface EmpruntService {
	public List<Emprunt> findByIsbnlivre(String isbnlivre);
	public Emprunt findByReference(String reference);
    public int emprunter(Emprunt emprunt);
    public List<Emprunt> findAll();
    public int restituer(String reference, Date dateRetour);
	public List<Emprunt> findByClientCin(String cinClient);

}
