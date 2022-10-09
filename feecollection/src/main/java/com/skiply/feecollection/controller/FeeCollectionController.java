package com.skiply.feecollection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.skiply.feecollection.entities.Fees;
import com.skiply.feecollection.entities.Student;
import com.skiply.feecollection.services.FeeCollectionService;


@RestController
@RequestMapping("/receipt")
public class FeeCollectionController {
	
	@Autowired
	private FeeCollectionService feeCollectionService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping
	public Fees collectFees(@RequestBody Fees fees) {
		return this.feeCollectionService.collectFees(fees);
		
	}
	
	@GetMapping("/{refID}")
	public Fees viewReceipt(@PathVariable("refID") int refID) {
		
		Fees fee = this.feeCollectionService.viewReceipt(refID);
		
		Student student = this.restTemplate.getForObject("http://localhost:9091/student/receipt/" + fee.getRefID(),Student.class);
		
		fee.setStudent(student);
		
		return fee;
		
	}

}
