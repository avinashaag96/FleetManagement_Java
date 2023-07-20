

package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.State;

public interface StateManager {

    void addState(State s);
    
    List<State> getStates();
    
    void delete(int id);
    
    void update(State state, int id);
    
    Optional<State> getState(int id);
    
//    List<State_Master> getStatesByName(String stateName);

}

