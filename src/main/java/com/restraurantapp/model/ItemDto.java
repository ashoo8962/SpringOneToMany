package com.restraurantapp.model;

import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemDto {

	private String itemName;
	private Integer itemId;
	private String itemType; // bf or lunch
	private double price;// south indian,north,italian

}
