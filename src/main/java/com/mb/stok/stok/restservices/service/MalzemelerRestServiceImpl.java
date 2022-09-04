package com.mb.stok.stok.restservices.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.stok.stok.entities.MalzemelerEntity;
import com.mb.stok.stok.services.MalzemelerService;

@Service
public class MalzemelerRestServiceImpl implements MalzemelerRestService  {
	
	@Autowired
	private MalzemelerService malzemelerService;

	@Override
	@Transactional
	public Boolean malzemeKaydet(MalzemelerEntity malzeme) {

		//Yetki kontrolü
        //Model convert entity
		
	return	malzemelerService.malzemeKaydet(malzeme);
		
		
		
		
	}

	@Override
	public List<MalzemelerEntity> getTumMalzemeListesi() {
	return malzemelerService.getTumMalzemeler();
	}

	@Override
	public List<MalzemelerEntity> getTumMalzemelerByDeletedAndMalzemeAdi(Boolean deleted, String malzemeAdi) {
		// TODO Auto-generated method stub
		return malzemelerService.getTumMalzemelerByDeletedAndMalzemeAdi(deleted,malzemeAdi);
	}

}
