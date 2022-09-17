package com.mb.stok.stok.restservices.service.malzeme;

import java.util.List;

import com.mb.stok.stok.entities.MalzemeEntity;

public interface MalzemeRestService {
	
	Boolean malzemeKaydet(MalzemeEntity malzeme);
	
	List<MalzemeEntity> getTumMalzemeListesi();
	
	List<MalzemeEntity> getTumMalzemelerByDeletedAndMalzemeAdi(Boolean deleted, String malzemeAdi);
	

}
