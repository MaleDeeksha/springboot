package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Party;
import com.spring.service.PartyService;

@RestController
public class PartyController {
	@Autowired
	public PartyService partyservice;

	@GetMapping("/partylist")
	public List<Party>getParty(@RequestBody Party party){
		return this.partyservice.listAll();
	}
	@PostMapping("/addparty")
	public Party addParty(@RequestBody Party party) {
		return this.partyservice.addParty(party);
	}
	
	@PostMapping("/updateparty")
    public ResponseEntity<Party> updateParty(@RequestBody Party party) {
        Party p = partyservice.updateParty(party);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
	@DeleteMapping("/delparty/{partyId}")
	public String deleteVoter(@PathVariable int partyId)
	{
		this.partyservice.deleteParty(partyId);
		return "party has been deleted";
	}
	
	
}
