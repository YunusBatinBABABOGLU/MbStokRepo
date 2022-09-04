package com.mb.stok.stok.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.stok.stok.entities.MalzemelerEntity;
import com.mb.stok.stok.repository.MalzemelerRepository;

@Service
public class MalzemelerServiceImpl implements MalzemelerService {
	
	@Autowired
	private MalzemelerRepository malzemelerRepository;

	@Override
	
	public Boolean malzemeKaydet(MalzemelerEntity malzeme) {

		 malzemelerRepository.save(malzeme);
		 
		 return true;
	}

	@Override
	public List<MalzemelerEntity> getTumMalzemeler() {
		return malzemelerRepository.findAll();
	}

	@Override
	public List<MalzemelerEntity> getTumMalzemelerByDeletedAndMalzemeAdi(Boolean deleted, String malzemeAdi) {
	return malzemelerRepository.findAllByDeletedAndMalzemeAdi(deleted,malzemeAdi);
	}
	
	

}
