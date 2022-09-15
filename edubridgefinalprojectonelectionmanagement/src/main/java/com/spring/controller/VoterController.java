package com.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Party;
import com.spring.model.Voter;
import com.spring.service.PartyService;
import com.spring.service.VoterService;

@RestController
public class VoterController {
	/*	@Autowired
		public VoterService voterservice;

		@Autowired
		public PartyService partyservice;
		 
		@GetMapping("/Voterlist")
		public List<Voter>getVoter(){
			return this.voterservice.listAll();
		}
		@PostMapping("/addvoter/{partyId}")
		public Voter addSVoter(@RequestBody Voter voter, @RequestParam("partyId") int partyId) {
			Party party = this.partyservice.findPartyById(partyId);
			voter.setParty(party);
			return this.voterservice.addVoter(voter);
		}
		@PostMapping("/updatevoter")
	    public ResponseEntity<Voter> updateVoter(@RequestBody Voter voter) {
	        Voter v = voterservice.updateVoter(voter);
	        return new ResponseEntity<>(v, HttpStatus.OK);
	    }
	    @DeleteMapping("/deletevoter")
	    public ResponseEntity<Voter> deleteVoter(@RequestParam(name = "voterId") Integer voterId) {
	        voterservice.deleteVoter(voterId);
	        return new ResponseEntity<>("voter with Id :" + voterId + " deleted successfully", HttpStatus.OK);
	    }*/
		
	@Autowired
	private VoterService voterService;
	@Autowired
	private PartyService partyService;
	
	
	@GetMapping("/voterlist")
	public List<Voter> getVoter()
	{
		return this.voterService.getAllVoter();
	}
	//http://localhost:8080/addemp1?deptid=3
	@PostMapping("/addvoter")
	public String addVoter(@RequestBody Voter voter,@RequestParam ("partyId")int partyId) 
	{
		//System.out.println("======>"+this.departmentService.getAllDepartment());
		Party p = this.partyService.searchById(partyId);
		//System.out.println("Dept id===>"+deptId);
		//System.out.println("Emp===>"+employee.getEmpName());
		voter.setParty(p);
	
				this.voterService.addVoter(voter);
				return "voter added has been successfully";
	
	}
	//http://localhost:8080/addemp1/3
	@PostMapping("/addvoter1/{partyId}")
	public String addVoter1(@RequestBody Voter voter,@PathVariable int partyId) 
	{
		//System.out.println("======>"+this.departmentService.getAllDepartment());
		Party p1 = this.partyService.searchById(partyId);
		//System.out.println("Dept id===>"+deptId);
		//System.out.println("Emp===>"+employee.getEmpName());
		voter.setParty(p1);
	
				this.voterService.addVoter(voter);
				return "Employee added has been successfully";
	
	}
	
	@DeleteMapping("/delvoter/{voterId}")
	public String deleteVoter(@PathVariable int voterid)
	{
		this.voterService.deleteVoter(voterid);
		return "voter has been deleted";
	}
	
	
		}
