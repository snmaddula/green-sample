package com.example.edl.service;

import org.springframework.stereotype.Service;

import com.example.edl.cache.InMemCacheStore;
import com.example.edl.dto.Product;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class InMemCacheService {
	
	private final InMemCacheStore cache;
	
	public void upsert(Product product) {
		Long id = product.getId();
		if(cache.containsKey(id)) {
			log.info(">> Product already exists in cache. Updating cache.");
		}else {
			log.info(">> Inserting product in cache. Total products cached :: {}", cache.size());
		}
		cache.put(id, product);
	}

}
