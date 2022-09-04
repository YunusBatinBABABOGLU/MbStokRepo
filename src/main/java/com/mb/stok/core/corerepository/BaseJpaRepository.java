package com.mb.stok.core.corerepository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseJpaRepository<T,UUID> extends JpaRepository<T, UUID> {

}
