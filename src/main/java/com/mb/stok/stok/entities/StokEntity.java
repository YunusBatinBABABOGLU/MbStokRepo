package com.mb.stok.stok.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mb.stok.core.coreentity.BaseEntity;

@Entity
@Table(name = "Stok")
public class StokEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1509202556958389970L;

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, updatable = false)
	private UUID id;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "Malzeme_ID")
	private MalzemeEntity malzeme;
	
	@Column(name = "StokAdedi", nullable = false, updatable = true)
	private Double stokAdedi;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "SonKullanimTarihi",nullable = true, updatable = true)
	private Date sonKullanimTarihi;
	
	@Column(name = "GarantiSuresi")
	private Integer garantiSuresi;

	public Double getStokAdedi() {
		return stokAdedi;
	}

	public void setStokAdedi(Double stokAdedi) {
		this.stokAdedi = stokAdedi;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public MalzemeEntity getMalzeme() {
		return malzeme;
	}

	public void setMalzeme(MalzemeEntity malzeme) {
		this.malzeme = malzeme;
	}


	public Date getSonKullanimTarihi() {
		return sonKullanimTarihi;
	}

	public void setSonKullanimTarihi(Date sonKullanimTarihi) {
		this.sonKullanimTarihi = sonKullanimTarihi;
	}

	public Integer getGarantiSuresi() {
		return garantiSuresi;
	}

	public void setGarantiSuresi(Integer garantiSuresi) {
		this.garantiSuresi = garantiSuresi;
	}
	
	

}
