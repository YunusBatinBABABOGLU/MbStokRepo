package com.mb.stok.stok.restservices.service;

import java.util.List;

import com.mb.stok.stok.entities.MalzemelerEntity;

public interface MalzemelerRestService {
	
	Boolean malzemeKaydet(MalzemelerEntity malzeme);
	
	List<MalzemelerEntity> getTumMalzemeListesi();
	
	List<MalzemelerEntity> getTumMalzemelerByDeletedAndMalzemeAdi(Boolean deleted, String malzemeAdi);
	

}
