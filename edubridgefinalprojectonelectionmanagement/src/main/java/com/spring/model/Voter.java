package com.spring.model;


import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Voter {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="voterId")
private int VoterId;
@NotEmpty(message = "Voter name is required.")
@Column(name = "voterName", nullable = false)
private String VoterName;

@NotEmpty(message = "Voter date is required.")
@Column(name="date")
private Date date;


@NotEmpty(message = "Voter feedback is required.")
@Column(name = "feedback", nullable = false)
private String feedback;	

@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private Party party;

public int getVoterId() {
	return VoterId;
}

public void setVoterId(int voterId) {
	VoterId = voterId;
}

public String getVoterName() {
	return VoterName;
}

public void setVoterName(String voterName) {
	VoterName = voterName;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getFeedback() {
	return feedback;
}

public void setFeedback(String feedback) {
	this.feedback = feedback;
}

public Party getParty() {
	return party;
}

public void setParty(Party party) {
	this.party = party;
}

}
