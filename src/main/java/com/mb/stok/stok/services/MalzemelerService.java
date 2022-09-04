package com.mb.stok.stok.services;

import java.util.List;

import com.mb.stok.stok.entities.MalzemelerEntity;

public interface MalzemelerService {
	
	Boolean malzemeKaydet(MalzemelerEntity malzeme);
	
	List<MalzemelerEntity> getTumMalzemeler();
	
	List<MalzemelerEntity> getTumMalzemelerByDeletedAndMalzemeAdi(Boolean deleted, String malzemeAdi);

}
