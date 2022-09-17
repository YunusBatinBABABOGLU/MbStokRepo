package com.mb.stok.stok.services.malzeme;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.stok.stok.entities.MalzemeEntity;
import com.mb.stok.stok.repository.MalzemeRepository;

@Service
public class MalzemeServiceImpl implements MalzemeService {
	
	@Autowired
	private MalzemeRepository malzemelerRepository;

	@Override
	
	public Boolean malzemeKaydet(MalzemeEntity malzeme) {

		 malzemelerRepository.save(malzeme);
		 
		 return true;
	}

	@Override
	public List<MalzemeEntity> getTumMalzemeler() {
		return malzemelerRepository.findAll();
	}

	@Override
	public List<MalzemeEntity> getTumMalzemelerByDeletedAndMalzemeAdi(Boolean deleted, String malzemeAdi) {
	return malzemelerRepository.findAllByDeletedAndMalzemeAdi(deleted,malzemeAdi);
	}
	
	

}
