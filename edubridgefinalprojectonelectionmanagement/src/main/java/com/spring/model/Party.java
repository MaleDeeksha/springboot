package com.spring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
@Entity
public class Party {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="partyId")
private int partyId;
@NotEmpty(message = "Party name is required.")
@Column(name = "partyName", nullable = false)
private String partyName;
@OneToMany(fetch = FetchType.EAGER, mappedBy = "party", cascade = CascadeType.ALL)
private List<Voter> voter  ;
public int getPartyId(){
	return partyId;
}
public void setPartyId(int partyId) {
	this.partyId = partyId;
}
public String getPartyName() {
	return partyName;
}
public void setPartyName(String partyName) {
	this.partyName = partyName;
}
public List<Voter> getVoter() {
	return voter;
}
public void setVoter(List<Voter> voter) {
	this.voter = voter;
}


}
