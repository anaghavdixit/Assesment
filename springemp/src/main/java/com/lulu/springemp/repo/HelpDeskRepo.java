package com.lulu.springemp.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.springemp.entity.HelpDesk;



public interface HelpDeskRepo extends JpaRepository<HelpDesk, Integer> {
	
	

}
