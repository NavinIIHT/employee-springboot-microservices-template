package com.iiht.training.employee.controller;

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

import com.iiht.training.employee.dto.CertificatesDto;
import com.iiht.training.employee.dto.EmployeeDto;
import com.iiht.training.employee.dto.SkillsDto;
import com.iiht.training.employee.proxy.CertificateServiceProxy;
import com.iiht.training.employee.proxy.SkillsServiceProxy;
import com.iiht.training.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private SkillsServiceProxy proxy;

	@Autowired
	private CertificateServiceProxy serviceProxy;

	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Integer id) {
		return null;

	}

	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
		return null;
	}

	@PostMapping("/employees")
	public ResponseEntity<EmployeeDto> addEmployee(@Valid @RequestBody EmployeeDto employeeDto, BindingResult result) {
		return null;
	}

	@PutMapping("/employees")
	public ResponseEntity<EmployeeDto> updateEmployee(@Valid @RequestBody EmployeeDto employeeDto,
			BindingResult result) {
		return null;
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Boolean> updateEmployee(@PathVariable("id") Integer id) {
		return null;
	}

	@GetMapping("/employees/skills/{id}")
	public List<SkillsDto> getSkillsByEmployeeIdFeign(@PathVariable("id") Integer id) {
		return null;
	}

	@GetMapping("/employees/certificates/{id}")
	public List<CertificatesDto> getCertificatesByEmployeeIdFeign(@PathVariable("id") Integer id) {
		return null;
	}

}
