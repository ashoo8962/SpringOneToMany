package com.restraurantapp.model;

//import java.awt.MenuItem;
import java.util.Set;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestraurantDto {
	private String restraurantName;
	private Integer restraurantId;

	private String category; // veg or non veg
	private String cuisine;// south indian,north,italian
	private String city;

	@OneToMany
	@JoinColumn(name="restraurant_id")
	private Set<ItemDto> items;
	

}
