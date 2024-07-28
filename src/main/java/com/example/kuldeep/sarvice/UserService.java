package com.example.kuldeep.sarvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kuldeep.reposetry.UserReposatry;
import com.example.kuldeep.userEntiti.User;

@Service
public class UserService {
	//post data
	@Autowired
	private UserReposatry userRepo;
	
	public User saveData(User user)
	{
		User save = userRepo.save(user);

		return save;
	}
	
	//one data show
		public User getData(Long userId) {
			return userRepo.findById(userId).get();
		}


		// update

		public User updateData(User user, Long userId) {
			User byId = userRepo.findById(userId).get();

			byId.setName(user.getName());
			byId.setFatherName(user.getFatherName());
			byId.setMobile(user.getMobile());
			byId.setCityName(user.getCityName());
			byId.setCityName(user.getCityName());

			return userRepo.save(byId);
		}
		
		// delete data

		public String deleteData(Long userId) {
			User byId = userRepo.findById(userId).get();
			userRepo.delete(byId);
			return "Data SuccussFully Deleted";
		}
	
}
