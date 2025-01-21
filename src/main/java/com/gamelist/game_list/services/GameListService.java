package com.gamelist.game_list.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamelist.game_list.dto.GameListDTO;
import com.gamelist.game_list.dto.GameMinDTO;
import com.gamelist.game_list.entities.GameList;
import com.gamelist.game_list.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	public GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
