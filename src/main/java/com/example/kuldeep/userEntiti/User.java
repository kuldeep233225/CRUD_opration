package com.example.kuldeep.userEntiti;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "my_table")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long myID;
	private String name;
	private String fatherName;
	private String mobile;
	private String cityName;
	private String Dis;
	
	

}
