package com.inningsinfo.Team.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inningsinfo.Team.entity.Team;

public interface TeamRepo extends JpaRepository<Team,Integer>{
    
}
