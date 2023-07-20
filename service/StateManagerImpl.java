package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.StateRepository;
import com.example.service.StateManager;
import com.example.entity.State;

@Service
public class StateManagerImpl implements StateManager {

    @Autowired
     StateRepository repository;

    @Override
    public void addState(State s) {
        repository.save(s);
    }

    @Override
    public List<State> getStates() {
        return repository.findAll();
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(State state, int id) {
        repository.update(state.getStateName(), id);
    }

    @Override
    public Optional<State> getState(int id) {
        return repository.findById(id);
        
    }
   
	}




