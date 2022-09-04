package com.mb.stok.stok.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mb.stok.stok.entities.MalzemelerEntity;
import com.mb.stok.stok.restservices.service.MalzemelerRestService;
import com.mb.stok.stok.restservices.service.MalzemelerRestServiceImpl;

@RestController
@RequestMapping("/stok/malzemeislemleri")
public class MalzemelerRestController {

	@Autowired
	private MalzemelerRestService malzemelerRestService;

	@PostMapping(value = "/malzemekaydet", consumes = "application/json", produces = "application/json")
	public void malzemeKaydet(@RequestBody MalzemelerEntity malzeme) {

		malzeme.setCreatedBy("Murat");

		Boolean sonuc = malzemelerRestService.malzemeKaydet(malzeme);

	}

	@PostMapping(value = "/malzemeupdate", consumes = "application/json", produces = "application/json")
	public void malzemeUpdate(@RequestBody MalzemelerEntity malzeme) {

		malzeme.setCreatedBy("Murat");

		Boolean sonuc = malzemelerRestService.malzemeKaydet(malzeme);

	}

	@GetMapping("/getTumMalzemeler")
	public void getTumMalzemeler() {

		List<MalzemelerEntity> malzemelerList = malzemelerRestService.getTumMalzemeListesi();

		for (MalzemelerEntity malzemelerEntity : malzemelerList) {

			System.out.println(malzemelerEntity.getId());
			System.out.println(malzemelerEntity.getMalzemeAdi());
			System.out.println(malzemelerEntity.getDeleted());
			System.out.println(malzemelerEntity.getCreatedBy());
			System.out.println("****************************");

		}
	}
	
	@GetMapping("/getMalzemelerByDeleted")
	public void getMalzemelerByDeleted() {

		List<MalzemelerEntity> malzemelerList = malzemelerRestService.getTumMalzemelerByDeletedAndMalzemeAdi(false,"kola");

		for (MalzemelerEntity malzemelerEntity : malzemelerList) {

			System.out.println(malzemelerEntity.getId());
			System.out.println(malzemelerEntity.getMalzemeAdi());
			System.out.println(malzemelerEntity.getDeleted());
			System.out.println(malzemelerEntity.getCreatedBy());
			System.out.println("****************************");

		}
	}
	
	

}
