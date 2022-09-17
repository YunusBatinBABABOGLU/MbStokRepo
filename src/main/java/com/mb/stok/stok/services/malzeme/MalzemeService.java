package com.mb.stok.stok.services.malzeme;

import java.util.List;

import com.mb.stok.stok.entities.MalzemeEntity;

public interface MalzemeService {
	
	Boolean malzemeKaydet(MalzemeEntity malzeme);
	
	List<MalzemeEntity> getTumMalzemeler();
	
	List<MalzemeEntity> getTumMalzemelerByDeletedAndMalzemeAdi(Boolean deleted, String malzemeAdi);

}
