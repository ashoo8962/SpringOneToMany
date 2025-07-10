package com.restraurantapp.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.restraurantapp.model.Restraurant;
import com.restraurantapp.model.RestraurantDto;
import com.restraurantapp.repository.IRestraurantRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestraurantServiceImpl implements IRestraurantService {

	private final IRestraurantRepository restRepository;
	private final ModelMapper mapper;

	private final String messgae = "";

	@Override
	public void addRestraurantDto(RestraurantDto restraurantDto) {
		// convert dto into entity
		Restraurant restraurant = mapper.map(restraurantDto, Restraurant.class);
		restRepository.save(restraurant);
	}

	@Override
	public void updateRestraurant(RestraurantDto restraurantDto) {
		Restraurant restraurant = mapper.map(restraurantDto, Restraurant.class);
		restRepository.save(restraurant);
	}

	@Override
	public void deleteRestraurant(int restraurantId) {
		restRepository.deleteById(restraurantId);

	}

	@Override
	public List<RestraurantDto> getAll() {
		List<Restraurant> restraurants = restRepository.findAll();
		return restraurants.stream().map(restraurant -> mapper.map(restraurant, RestraurantDto.class)).toList();

	}

	@Override
	public RestraurantDto getById(int restraurantId) {
		Restraurant restraurant = restRepository.findById(restraurantId)
				.orElseThrow(() -> new RuntimeException("invalid id"));
		return mapper.map(restraurant, RestraurantDto.class);

	}

	@Override
	public List<RestraurantDto> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RestraurantDto> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RestraurantDto> getByCuisineItemType(String cuisine, String itemType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RestraurantDto> getByCategoryItemName(String category, String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RestraurantDto> getByItemName(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

}
