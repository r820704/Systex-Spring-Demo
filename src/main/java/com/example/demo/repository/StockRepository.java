package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StockEntity;

public interface StockRepository extends
	JpaRepository<StockEntity, Long>{
	
	List<StockEntity> findByBrokerid(String brokerid) ;
	
	void deleteByBrokerid(String brokerid);
}
