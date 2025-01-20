package com.gamelist.game_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gamelist.game_list.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
}
