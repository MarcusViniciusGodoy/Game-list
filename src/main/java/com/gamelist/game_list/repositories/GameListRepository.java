package com.gamelist.game_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamelist.game_list.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
