package com.microsoft.azure.samples.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HalfordsRetailDashboardService {

	@Autowired
	private StoreRepository storeRepository;
	

    
    public List<HalfordsStoreMaster> getStoreMasterDetails() {
        return (List<HalfordsStoreMaster>) storeRepository.findAll();
    }
//    public Dog getDogById(long id) {
//        Optional<Dog> optionalDog = repository.findById(id);
//        return optionalDog.orElseThrow(() -> new DogNotFoundException("Couldn't find a Dog with id: " + id));
//    }
//    private Dog toEntity(DogDto dto) {
//        Dog entity = new Dog();
//        entity.setName(dto.getName());
//        entity.setAge(dto.getAge());
//        return entity;
//    }

	
	
	
}
