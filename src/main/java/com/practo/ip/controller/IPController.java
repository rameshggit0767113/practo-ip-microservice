package com.practo.ip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practo.ip.dto.Admission;

@RestController
@RequestMapping("/ip")
public class IPController {

	@GetMapping(path = "/getAdmissionDetails")
	public Admission getAdmissionDetails(@RequestParam("admissionId") String admissionId) {
		return new Admission("ADM0989067", "ERGHYOP9043", "PRABHATH", "SINHA");
		
	}
	
}
