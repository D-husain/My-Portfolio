package com.myportfolio.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myportfolio.entity.Contact;

public interface ContactReposetory extends JpaRepository<Contact, Integer> {

}
