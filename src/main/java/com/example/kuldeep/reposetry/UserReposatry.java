package com.example.kuldeep.reposetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.kuldeep.userEntiti.*;

@Repository
public interface UserReposatry extends JpaRepository<User, Long> {

	
}
