package com.mb.stok.core.enums;

public enum StatuEnum {
	
    AKTIF("Aktif",1),
    PASIF("Pasif",2),
    SILINDI("Silindi",3);
  
	int id;
	String tanim ;
	
	private StatuEnum(String tanim, int id) {
		this.id=id;
		this.tanim=tanim;
		
	}

}
