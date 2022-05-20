package com.example.edl.dto;

import lombok.Data;

@Data
public class Product {

	private Long id;
	private String title;
	private String description;
	private Double price;
}
