package com.mb.stok.stok.restservices.service.malzeme;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.stok.stok.entities.MalzemeEntity;
import com.mb.stok.stok.services.malzeme.MalzemeService;

@Service
public class MalzemeRestServiceImpl implements MalzemeRestService  {
	
	@Autowired
	private MalzemeService malzemelerService;

	@Override
	@Transactional
	public Boolean malzemeKaydet(MalzemeEntity malzeme) {

		//Yetki kontrolü
        //Model convert entity
		
	return	malzemelerService.malzemeKaydet(malzeme);
		
		
		
		
	}

	@Override
	public List<MalzemeEntity> getTumMalzemeListesi() {
	return malzemelerService.getTumMalzemeler();
	}

	@Override
	public List<MalzemeEntity> getTumMalzemelerByDeletedAndMalzemeAdi(Boolean deleted, String malzemeAdi) {
		// TODO Auto-generated method stub
		return malzemelerService.getTumMalzemelerByDeletedAndMalzemeAdi(deleted,malzemeAdi);
	}

}
