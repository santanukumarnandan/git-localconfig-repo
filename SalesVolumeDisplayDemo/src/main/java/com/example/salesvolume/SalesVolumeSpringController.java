package com.example.salesvolume;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalesVolumeSpringController {
	

	@RequestMapping("/")
    public String homepage(){
        return "salesvolume";
    }

}
