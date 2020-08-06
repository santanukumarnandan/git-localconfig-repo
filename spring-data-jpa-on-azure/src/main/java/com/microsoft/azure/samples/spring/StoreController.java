/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.samples.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import antlr.collections.List;

import java.math.BigDecimal;
import java.util.Optional;


@RestController
//@ComponentScan("com.microsoft")
@RequestMapping(path="/store-master")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;

    
    
    @GetMapping("/store-master/{id}")
	public Optional<StoreMaster> retreiveStoreMasterbyId(@PathVariable Integer id) {
    
    	Optional<StoreMaster>  storeMaster =  storeRepository.findById(id);
    	return storeMaster;
    }
    
    
    @GetMapping("/store-master")
  	public List retreiveStoreMaster() {
      
      	java.util.List<StoreMaster>  storeMaster =  storeRepository.findAll();
      	return (List) storeMaster;
      }
    
	/*
	 * @PostMapping public @ResponseBody String createPet(@RequestBody StoreMaster
	 * storeMaster) { storeRepository.save(storeMaster); return
	 * String.format("Added %s.", storeMaster); }
	 * 
	 * @GetMapping public @ResponseBody Iterable<StoreMaster> getAllPets() { return
	 * storeRepository.findAll();
	 * 
	 * }
	 * 
	 * @GetMapping("/{id}") public @ResponseBody Optional<StoreMaster>
	 * getPet(@PathVariable Integer id) { return storeRepository.findById(id); }
	 * 
	 * @DeleteMapping("/{id}") public @ResponseBody String deletePet(@PathVariable
	 * Integer id) { storeRepository.deleteById(id); return "Deleted " + id; }
	 */
}
