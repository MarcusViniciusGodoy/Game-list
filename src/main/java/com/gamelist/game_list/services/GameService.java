package com.gamelist.game_list.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamelist.game_list.GameMinDTO;
import com.gamelist.game_list.entities.Game;
import com.gamelist.game_list.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	public GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
