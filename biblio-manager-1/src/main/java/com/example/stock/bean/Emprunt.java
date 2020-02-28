package com.example.stock.bean;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Emprunt {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String reference;
	private String isbnlivre;
    @Temporal(TemporalType.DATE)
	private Date dateEmprunt;
    @Temporal(TemporalType.DATE)
    private Date dateRetour;
	@ManyToOne
    private Client client;
	

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsbnlivre() {
		return isbnlivre;
	}

	public void setIsbnlivre(String isbnlivre) {
		this.isbnlivre = isbnlivre;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;

	}

	public Emprunt(long id, String reference, String isbnlivre, Date dateEmprunt, Date dateRetour, Client client) {
		super();
		this.id = id;
		this.reference = reference;
		this.isbnlivre = isbnlivre;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
		this.client = client;
	}

	public Emprunt() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

