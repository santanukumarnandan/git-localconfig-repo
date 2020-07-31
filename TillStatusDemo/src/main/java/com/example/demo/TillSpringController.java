package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TillSpringController {

	
	
////	@GetMapping({"/", "/hello"})
////    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
////        model.addAttribute("name", name);
////        return "hello";
////    }
//	
//	@GetMapping
//    String getView(Model model) {
//        model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
//        return "hello";
//    }
	
	@RequestMapping("/")
    public String homepage(){
        return "index";
    }
	
	
}
