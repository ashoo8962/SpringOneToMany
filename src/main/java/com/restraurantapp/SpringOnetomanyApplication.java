package com.restraurantapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale.Category;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restraurantapp.model.CATEGORY;
import com.restraurantapp.model.CUISINE;
import com.restraurantapp.model.ITEMTYPE;
import com.restraurantapp.model.ItemDto;
import com.restraurantapp.model.RestraurantDto;
import com.restraurantapp.service.IRestraurantService;

@SpringBootApplication
public class SpringOnetomanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetomanyApplication.class, args);
	}
	@Autowired
	private IRestraurantService restraurantService;

	@Override
	public void run(String... args) throws Exception {
		
		ItemDto item1 = new ItemDto("Fried rice",null,ITEMTYPE.MAINCOURSE.name(),500);
		ItemDto item2 = new ItemDto("Ice Cream",null,ITEMTYPE.DESSERT.name(),100);
		ItemDto item3 = new ItemDto("Fried rice",null,ITEMTYPE.SOUPS.name(),600);
		
		Set<ItemDto> itemDtos= new HashSet<>(Arrays.asList(item1,item2,item3));
		
		RestraurantDto restraurantDto = new 
				RestraurantDto("Nandoos",null,CATEGORY.NONVEG.name(),CUISINE.NI.getCuisineType(),"bengaluru",itemDtos);
		
				
		
//		restraurantService.addRestraurantDto();
		
		
	}

}
