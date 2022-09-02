package com.mb.stok.stok.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
	@Column(name = "id", nullable = false,  updatable = false)
	private UUID id;
	
	private Double stokAdedi;

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
	
	

}
