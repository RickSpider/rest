package com.upa.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.upa.rest.model.Alumno;
import com.upa.rest.repo.AlumnoRepo;


@RestController
public class Hello {
	
	@Autowired
	private AlumnoRepo ar;

	@GetMapping(value = "/hello", produces = "application/json")
	public ResponseEntity sayHello() {

		return new ResponseEntity("Hello!!!!!!!", HttpStatus.OK);

	}
	
	/*@GetMapping(value = "/hellojson", produces = "application/json")
	public ResponseEntity sayHelloJSON() {
		
		Alumno a = new Alumno(1, "Ricardo Gonzalez");
		
		return new ResponseEntity(a, HttpStatus.OK);
	}*/
	
	
	@GetMapping(value = "/alumnos", produces = "application/json")
	public ResponseEntity sayHelloJSON() {
		
		return new ResponseEntity(ar.findAll(), HttpStatus.OK);
	}
	
	  
    @PostMapping(value = "/alumno", produces = "application/json")
    public @ResponseBody ResponseEntity factura(@RequestBody Alumno a) {
    	
    	Alumno out = this.ar.save(a);
    	
    	return new ResponseEntity(out, HttpStatus.CREATED);
    	
    }
	

}
