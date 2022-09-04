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


	
	




	



}
