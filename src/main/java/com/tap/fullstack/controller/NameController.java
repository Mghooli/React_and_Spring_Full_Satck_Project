package com.tap.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tap.fullstack.model.NameEntry;
import com.tap.fullstack.repository.NameRepository;

//@RestController
//@RequestMapping("/api")
//@CrossOrigin(origins="http://localhost:5173")
//
//public class NameController {
//    @Autowired
//	private NameRepository nameRepo;
//    
////    public String submitName(@RequestBody NameEntry entry) {
////    	nameRepo.save(entry);
////		return "Hello"+entry.getName() +"..! Welcome from backend";
////    	
////    }
//    @GetMapping("/all")
//    public java.util.List<NameEntry> getAllNames(){
//    	return nameRepo.findAll();
//    }
//    @GetMapping("/hello")
//    public String sayHello(@RequestParam String name) {
//        return "Hello " + name + " ..! Welcome from backend";
//    }
//}
//	
@RestController
@RequestMapping("/api")
public class NameController {
	
	@Autowired
	private NameRepository nameRepo;

    @CrossOrigin(origins = "http://localhost:5173") // Allow frontend access
    @GetMapping("/name")
    public ResponseEntity<String> saveName(@RequestParam String name) {
    	NameEntry entry = new NameEntry();
    	entry.setName(name);
    	nameRepo.save(entry);
        return ResponseEntity.ok("Hello, " + entry.getName() + "..! Greeting from Spring Boot");
    }
}


