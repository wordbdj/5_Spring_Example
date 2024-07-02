package com.example.lesson03.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Review {
	
	private int id;
	private int storeId;
	private String menu;
	private String userName;
	private Double point;
	private String review;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	
	

	
	
	
}
