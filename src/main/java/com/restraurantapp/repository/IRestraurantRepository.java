package com.restraurantapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restraurantapp.model.Restraurant;
//import com.restraurantapp.model.RestraurantDto;

@Repository
public interface IRestraurantRepository extends JpaRepository<Restraurant, Integer>{

	
	List<Restraurant> findByCuisine(String cuisine);
	List<Restraurant> findByCategory(String category);
	//custom query
	@Query("from Restraurant r inner join r.items it where r.cuisine = ?1 cuisine and it.itemType=?2 itemType")
	List<Restraurant> findByCuisineItemType(String cuisine,String itemType);
	
	@Query("from Restraurant r inner join r.items it where r.category = ?1 category and it.itemName like ?2 itemName")
	List<Restraurant> findByCategoryItemName(String category,String itemName);

	@Query("from Restraurant r inner join r.items it where it.itemName like ?1 itemName")
	List<Restraurant> findByItemName(String itemName);

	
}
