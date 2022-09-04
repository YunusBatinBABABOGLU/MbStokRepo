package com.mb.stok.core.corerepository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public abstract class BaseJpaRepository<T> implements JpaRepository<T, UUID>{

}
