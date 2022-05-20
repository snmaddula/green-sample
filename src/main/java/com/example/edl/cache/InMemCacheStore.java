package com.example.edl.cache;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

import com.example.edl.dto.Product;

/**
 * 
 * Mock simulation of gemfire cache store using in-memory map
 */
@Component
public class InMemCacheStore extends LinkedHashMap<Long, Product> {

}
