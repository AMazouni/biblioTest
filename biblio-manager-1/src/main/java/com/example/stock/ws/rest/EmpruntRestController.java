package com.example.stock.ws.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.bean.Emprunt;
import com.example.stock.service.facade.EmpruntService;

@RestController
@RequestMapping("biblio-api/emprunt")
public class EmpruntRestController {
	@Autowired
	private EmpruntService empruntService;
    @GetMapping("/isbnlivre/{isbnlivre}")
	public List<Emprunt> findByIsbnlivre(@PathVariable String isbnlivre) {
		return empruntService.findByIsbnlivre(isbnlivre);
	}
    @GetMapping("/reference/{reference}")
	public Emprunt findByReference(@PathVariable String reference) {
		return empruntService.findByReference(reference);
	}
    @GetMapping("/client/cin/{cinClient}")
	public List<Emprunt> findByClientCin(@PathVariable String cinClient) {
		return empruntService.findByClientCin(cinClient);
	}
    @PostMapping("/")
	public int emprunter(@RequestBody Emprunt emprunt) {
		return empruntService.emprunter(emprunt);
	}
    @GetMapping("/")  
	public List<Emprunt> findAll() {
		return empruntService.findAll();
	}
    @PutMapping("/reference/{reference}/dateRetour/{dateRetour}")
	public int restituer(@PathVariable String reference,@PathVariable Date dateRetour) {
		return empruntService.restituer(reference, dateRetour);
	}

}
