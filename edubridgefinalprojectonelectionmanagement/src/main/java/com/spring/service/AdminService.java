package com.spring.service;

import java.util.List;
//import java.util.NoSuchElementException;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.exception.ResourceNotFoundException;
import com.spring.model.Admin;
import com.spring.model.Party;
import com.spring.model.Voter;
import com.spring.repository.AdminRepository;
import com.spring.repository.PartyRepository;
import com.spring.repository.VoterRepository;




@Service
public class AdminService{
	@Autowired
private AdminRepository adminRepository;

	@Autowired
	private VoterRepository voterRepository;
	
	@Autowired
	private PartyRepository partyRepository;

	public AdminService(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	//@Override
	public Admin saveAdmin(Admin admin) {
		System.out.println("admin register service"+admin);

		return adminRepository.save(admin);
	}

	//@Override
	public Admin loginAdmin(Admin admin) {
		return this.adminRepository.findByAdminEmailIdAndAdminPassword(admin.adminEmailId,admin.adminPassword).orElseThrow(()->new ResourceNotFoundException("Admin ", "Id",admin.adminEmailId+"and password "+admin.adminPassword ));
	}

	//@Override
	public List<Party> getAllParty(long adminId) {
		
		// TODO Auto-generated method stub
		return  partyRepository.findAll();
	}
	
	//@Override
	public List<Voter> getAllVoters(long adminId) {
		// TODO Auto-generated method stub
		return voterRepository.findAll();
	}

			
		

	}

