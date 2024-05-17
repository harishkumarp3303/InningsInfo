package com.example.Tournament.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Tournament.entity.Tournament;

public interface TournamentRepo extends JpaRepository<Tournament,Integer>{
    
}
