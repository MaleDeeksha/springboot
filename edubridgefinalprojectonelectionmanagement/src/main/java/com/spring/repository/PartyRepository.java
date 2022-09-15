package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Party;
import com.spring.model.Voter;

public interface PartyRepository extends JpaRepository<Party,Integer> {


	Party findById(int partyId);

	//Voter save(Voter voter);



}
