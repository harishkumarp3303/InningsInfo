package com.inningsinfo.Player.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inningsinfo.Player.entity.Player;

public interface PlayerRepo extends JpaRepository<Player,Integer>{
    
}
