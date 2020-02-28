package com.example.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.bean.Emprunt;
import com.example.stock.dao.EmpruntDao;
import com.example.stock.service.facade.EmpruntService;

@Service
public class EmpruntServiceImpl implements EmpruntService {
	@Autowired
	private EmpruntDao empruntDao;

	@Override
	public int emprunter(Emprunt emprunt) {
		Emprunt foundedEmprunt = findByReference(emprunt.getReference());
		if (foundedEmprunt != null)
			return -1;
		else {
			emprunt.setDateRetour(null);
			emprunt.setDateEmprunt(new Date());
			empruntDao.save(emprunt);
			return 1;
		}
	}

	@Override
	public int restituer(String reference, Date dateRetour) {

		Emprunt foundedEmprunt = findByReference(reference);
		if (foundedEmprunt == null)
			return -1;
		else if(foundedEmprunt.getDateRetour()!=null)
			return -2;
		else {
			foundedEmprunt.setDateRetour(dateRetour);
			empruntDao.save(foundedEmprunt);
			return 1;
		}
			}

	@Override
	public List<Emprunt> findByIsbnlivre(String isbnlivre) {
		return empruntDao.findByIsbnlivre(isbnlivre);
	}

	@Override
	public Emprunt findByReference(String reference) {
		return empruntDao.findByReference(reference);
	}

	@Override
	public List<Emprunt> findByClientCin(String cinClient) {
		return empruntDao.findByClientCin(cinClient);
	}


	@Override
	public List<Emprunt> findAll() {
		return empruntDao.findAll();
	}

}
