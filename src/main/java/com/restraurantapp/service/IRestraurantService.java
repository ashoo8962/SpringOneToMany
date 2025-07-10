package com.restraurantapp.service;

import java.util.List;

import com.restraurantapp.model.RestraurantDto;

public interface IRestraurantService {

	void  addRestraurantDto(RestraurantDto restraurantDto);
	void  updateRestraurant(RestraurantDto restraurantDto);
	void deleteRestraurant(int restraurantId);
	List <RestraurantDto> getAll();
	RestraurantDto getById(int restraurantId);
	
	List<RestraurantDto> getByCuisine(String cuisine);
	List<RestraurantDto> getByCategory(String category);
	List<RestraurantDto> getByCuisineItemType(String cuisine,String itemType);
	List<RestraurantDto> getByCategoryItemName(String category,String itemName);
	List<RestraurantDto> getByItemName(String itemName);

}
