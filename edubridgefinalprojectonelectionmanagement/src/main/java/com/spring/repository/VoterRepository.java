package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Voter;


public interface VoterRepository extends JpaRepository<Voter,Integer> {


}
