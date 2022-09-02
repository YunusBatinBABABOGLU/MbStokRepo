package com.mb.stok.stok.entities;


import java.time.Instant;
import java.util.UUID;

import javax.persistence.*;
//import org.springframework.data.annotation.Id;
//
//import org.springframework.data.annotation.Id;

import com.mb.stok.core.coreentity.BaseEntity;

@Entity
@Table(name = "Malzemeler")
public class MalzemelerEntity extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4452101883365638465L;
	
	@Id
	  @GeneratedValue
	@Column(name = "id", nullable = false,  updatable = false)
	private UUID id;

	
	@Column(name = "malzemeadi", nullable = true,  updatable = true)
	private String malzemeAdi;
	
	@Column(name = "malzemeadet", nullable = true,  updatable = true)
	private Double malzemeAdet;
	
	private Instant malzemeSonKullanimTarihi;

	
	public String getMalzemeAdi() {
		return malzemeAdi;
	}

	public void setMalzemeAdi(String malzemeAdi) {
		this.malzemeAdi = malzemeAdi;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Double getMalzemeAdet() {
		return malzemeAdet;
	}

	public void setMalzemeAdet(Double malzemeAdet) {
		this.malzemeAdet = malzemeAdet;
	}

	public Instant getMalzemeSonKullanimTarihi() {
		return malzemeSonKullanimTarihi;
	}

	public void setMalzemeSonKullanimTarihi(Instant malzemeSonKullanimTarihi) {
		this.malzemeSonKullanimTarihi = malzemeSonKullanimTarihi;
	}
	
	




	



}
