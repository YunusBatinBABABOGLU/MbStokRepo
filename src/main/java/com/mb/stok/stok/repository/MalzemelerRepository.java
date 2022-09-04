package com.mb.stok.stok.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.mb.stok.core.corerepository.BaseJpaRepository;
import com.mb.stok.stok.entities.MalzemelerEntity;

@Repository
public interface MalzemelerRepository extends JpaRepository<MalzemelerEntity, UUID> {
	
	List<MalzemelerEntity> findAllByDeletedAndMalzemeAdi(Boolean deleted,String malzemeAdi);

}
