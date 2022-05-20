package com.example.edl.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.edl.dto.Product;
import com.example.edl.service.InMemCacheService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("edl/product")
public class EdlProductController {
	
	private final InMemCacheService service;

	@PostMapping("upsert")
	public String upsertProduct(@RequestBody Product product) {
		log.info("Received EDL Msg : {}", product);
		service.upsert(product);
		return "success";
	}
}
