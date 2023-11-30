package com.myportfolio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myportfolio.entity.Contact;
import com.myportfolio.reposetory.ContactReposetory;

@Service
public class Dao {

	@Autowired
	private ContactReposetory ContactRepo;
	
	
	public void AddContact(Contact contact) {
		ContactRepo.save(contact);
	}
	
}
