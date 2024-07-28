package com.example.kuldeep.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kuldeep.sarvice.UserService;
import com.example.kuldeep.userEntiti.User;

@RestController
@RequestMapping("/kuldeep")
public class UserController {

	@Autowired
	private UserService userService;
	//post data
	@PostMapping("/postdata")
	public User saveData(@RequestBody User user)
	{
		User saveData = userService.saveData(user);
		return saveData;
	}
	
	//one data show 
	@GetMapping("/get/{userId}")

	public User getData(@PathVariable Long userId) {
		return userService.getData(userId);
	}

	//update
	@PutMapping("/update/{id}")
	public User updateData(@RequestBody User user,@PathVariable("id") Long userId) {
		return userService.updateData(user, userId);
	}
	

	// delete Data

	@DeleteMapping("/delete/{userId}")
	public String deleteData(@PathVariable Long userId) {
		return userService.deleteData(userId);
	}

}
