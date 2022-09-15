package com.spring.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Party;
import com.spring.model.Voter;
import com.spring.repository.PartyRepository;
import com.spring.repository.VoterRepository;

@Service
public class VoterService {
/*	@Autowired
	public VoterRepository voterrepository;
    	public List<Voter> listAll(){
		return voterrepository.findAll();
	}
	public Voter addVoter(Voter voter) {
		return voterrepository.save(voter);
	}
	public void deleteVoter(int id) {
		 voterrepository.deleteById(id);
	}
		// TODO Auto-generated method stub
		
	public Voter updateVoter(Voter voter) {
		 return voterrepository.save(voter);

				}*/
	@Autowired
	private VoterRepository voterRepository;
	
	public List<Voter> getAllVoter()
	{
		return voterRepository.findAll();
	}
	
	public Voter addVoter(Voter voter)
	{
		return voterRepository.save(voter);
	}
	
	public Voter searchById(int voterId)
	{
		return  voterRepository.findById(voterId).get();
	}
	public void deleteVoter(int voterId) {
	
			voterRepository.deleteById(voterId);			
		}
	
	
}
