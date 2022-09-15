package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Party;
import com.spring.model.Voter;
import com.spring.repository.PartyRepository;


@Service
public class PartyService {
	@Autowired
	public PartyRepository party;

	public List<Party> listAll(){
		return party.findAll();
	}
	public Party addParty(Party p) {
		return party.save(p);
	}
	public Party searchById(int id) {
		return party.findById(id);
	}
public void deleteParty(int id) {
	 party.deleteById(id);
}

public Party updateParty(Party p) {
	return party.save(p);
}
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
}

	




