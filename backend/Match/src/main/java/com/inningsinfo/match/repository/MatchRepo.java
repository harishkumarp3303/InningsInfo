package com.inningsinfo.match.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inningsinfo.match.entity.Match;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    
}
