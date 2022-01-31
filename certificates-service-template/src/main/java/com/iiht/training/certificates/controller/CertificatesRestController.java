package com.iiht.training.certificates.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.certificates.dto.CertificatesDto;
import com.iiht.training.certificates.service.CertificatesService;

@RestController
@RequestMapping("/api")
public class CertificatesRestController {

	@Autowired
	private CertificatesService certificatesService;

	@PostMapping("/certificates")
	public ResponseEntity<CertificatesDto> addCertificate(@Valid @RequestBody CertificatesDto certificatesDto,
			BindingResult result) {
		return null;
	}

	@PutMapping("/certificates")
	public ResponseEntity<CertificatesDto> updateCertificate(@Valid @RequestBody CertificatesDto certificatesDto,
			BindingResult result) {
		return null;
	}

	@DeleteMapping("/certificates/{id}")
	public ResponseEntity<Boolean> deleteCertificateById(@PathVariable("id") Integer id) {
		return null;
	}

	// get certificates by certificate id
	@GetMapping("/certificates/{id}")
	public ResponseEntity<CertificatesDto> getCertificateById(@PathVariable("id") Integer id) {
		return null;
	}

	// get All certificates
	@GetMapping("/certificates")
	public ResponseEntity<List<CertificatesDto>> getAllCertificates() {
		return null;
	}

	// get certificates by employeeId
	@GetMapping("/certificates/employee/{employeeId}")
	public ResponseEntity<List<CertificatesDto>> getCertificatesByEmployeeId(@PathVariable Integer employeeId) {
		return null;
	}

	// get certificates by skillName
	@GetMapping("/certificates/skills/{skillName}")
	public ResponseEntity<List<CertificatesDto>> getCertificatesBySkillName(@PathVariable String skillName) {
		return null;
	}

}
