package com.restraurantapp.model;

//import java.awt.MenuItem;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Restraurant {
	@Column(length = 30)
	private String restraurantName;
	@Id
	@GeneratedValue(generator = "restraurant_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "restraurant_gen", sequenceName = "restraurant_seq", initialValue = 50)
	private Integer restraurantId;

	@Column(length = 30)
	private String category; // veg or non veg
	@Column(length = 30)
	private String cuisine;// south indian,north,italian
	@Column(length = 30)
	private String city;

	@OneToMany
	private Set<Item> items;

}
