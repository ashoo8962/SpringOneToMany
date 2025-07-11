package com.restraurantapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale.Category;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.restraurantapp.model.CATEGORY;
import com.restraurantapp.model.CUISINE;
import com.restraurantapp.model.ITEMTYPE;
import com.restraurantapp.model.ItemDto;
import com.restraurantapp.model.RestraurantDto;
import com.restraurantapp.service.IRestraurantService;


@SpringBootApplication(scanBasePackages = "com.restraurantapp")
public class SpringOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetomanyApplication.class, args);
	}

	@Autowired
	private IRestraurantService restraurantService;

	@Override
	public void run(String... args) throws Exception {

		ItemDto item1 = new ItemDto("Fried rice", null, ITEMTYPE.MAINCOURSE.name(), 500);
		ItemDto item2 = new ItemDto("Ice Cream", null, ITEMTYPE.DESSERT.name(), 100);
		ItemDto item3 = new ItemDto("Tomato Soup ", null, ITEMTYPE.SOUPS.name(), 600);

		Set<ItemDto> itemDtos = new HashSet<>(Arrays.asList(item1, item2, item3));

		RestraurantDto restraurantDto = new RestraurantDto("Nandoos", null, CATEGORY.NONVEG.name(),
				CUISINE.NI.getCuisineType(), "bengaluru", itemDtos);
		// adding restrau
		restraurantService.addRestraurantDto(restraurantDto);

		item1 = new ItemDto("Masala dosa", null, ITEMTYPE.MAINCOURSE.name(), 500);
		item2 = new ItemDto(" Jamun", null, ITEMTYPE.DESSERT.name(), 100);
		item3 = new ItemDto("Palak Soup ", null, ITEMTYPE.SOUPS.name(), 600);

		itemDtos = new HashSet<>(Arrays.asList(item1, item2, item3));

		restraurantDto = new RestraurantDto("Udupi ", null, CATEGORY.VEG.name(), CUISINE.SI.getCuisineType(), "Mumbai",
				itemDtos);

		// restraurantService.addRestraurantDto(restraurantDto);

		System.out.println();
		System.out.println("get by cuisine");
		restraurantService.getByCuisine(CUISINE.SI.getCuisineType()).forEach(System.out::println);

		System.out.println();
		System.out.println("get by category");
		restraurantService.getByCategory(CATEGORY.NONVEG.name()).forEach(System.out::println);

		System.out.println();
		System.out.println("get by itemname");
		restraurantService.getByItemName("soup").forEach(System.out::println);

		System.out.println();
		System.out.println("get by itemtype");
		restraurantService.getByCuisineItemType(CUISINE.SI.getCuisineType(),"BREAKFAST").forEach(System.out::println);

	}

}
