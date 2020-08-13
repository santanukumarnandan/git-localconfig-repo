/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.samples.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends JpaRepository<HalfordsStoreMaster, Long>{
	
//	 StoreMaster findStoreDetailsbyStoreNumber(Integer id); 
}
