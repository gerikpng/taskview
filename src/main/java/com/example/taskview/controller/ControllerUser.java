package com.example.taskview.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskview.dto.DtoUser;
import com.example.taskview.model.user;
import com.example.taskview.repository.RepositoryUser;

import jakarta.validation.Valid;

@RestController
public class ControllerUser {
	
	@Autowired
	RepositoryUser repository;
	
	@PostMapping("/user")
	public ResponseEntity<user> setNewUser(@RequestBody @Valid DtoUser dtouser){
		var userModel = new user();
		BeanUtils.copyProperties(dtouser, userModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(userModel));
		
	}
	
	
	@GetMapping("/user")
	public ResponseEntity<List<user>> getAllController(){
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<Object> updateController(@PathVariable(value="id") UUID id, @RequestBody @Valid DtoUser dtouser){
		Optional<user> Objeto = repository.findById(id);
		if(Objeto.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NENHUM DADO ENCONTRADO");
		}
		user userModel = Objeto.get();
		BeanUtils.copyProperties(dtouser, userModel);
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(userModel));
	}

}
