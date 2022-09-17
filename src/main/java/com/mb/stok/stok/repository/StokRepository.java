package com.mb.stok.stok.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mb.stok.stok.entities.StokEntity;

@Repository
public interface StokRepository extends JpaRepository<StokEntity, UUID> {

}
