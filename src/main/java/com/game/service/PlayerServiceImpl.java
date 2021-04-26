package com.game.service;

import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import com.game.repository.PlayerRepository;
import com.game.service.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;

    private static final int LEFT_BIRTHDAY_YEAR = 2000;
    private static final int RIGHT_BIRTHDAY_YEAR = 3000;
    private static final int NAME_LENGTH = 12;
    private static final int TITLE_LENGTH = 30;

    @Autowired
    public void setPlayerRepository(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    @Override
    public Page<Player> getAllPlayers(Specification<Player> specification, Pageable pageable) {
        return playerRepository.findAll(specification, pageable);
    }

    @Override
    public Long getPlayersCount(Specification<Player> specification) {
        return playerRepository.count(specification);
    }

    @Override
    public Player getPlayerById(Long id) {
        validateId(id);
        return null;
    }



    @Override
    public void deletePlayerById(Long id) {

    }

    @Override
    public Player createPlayer(Player player) {
        return null;
    }

    @Override
    public Player updatePlayer(Long id, Player newPlayer) {
        return null;
    }

    @Override
    public Specification<Player> filterByName(String name) {
        return null;
    }

    @Override
    public Specification<Player> filterByTitle(String title) {
        return null;
    }

    @Override
    public Specification<Player> filterByRace(Race race) {
        return null;
    }

    @Override
    public Specification<Player> filterByProfession(Profession profession) {
        return null;
    }

    @Override
    public Specification<Player> filterByExperience(Integer min, Integer max) {
        return null;
    }

    @Override
    public Specification<Player> filterByLevel(Integer min, Integer max) {
        return null;
    }

    @Override
    public Specification<Player> filterByUntilNextLevel(Integer min, Integer max) {
        return null;
    }

    @Override
    public Specification<Player> filterByBirthday(Long after, Long before) {
        return null;
    }

    @Override
    public Specification<Player> filterByBanned(Boolean banned) {
        return null;
    }


    private void validateId(Long id) {
        if(id <= 0){
            throw new BadRequestException("Player id is invalid!");
        }
    }

}


