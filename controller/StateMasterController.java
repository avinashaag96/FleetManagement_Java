package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.service.StateManager;
import com.example.entity.State;

@RestController
@CrossOrigin("http://localhost:3000")
public class StateMasterController {

    @Autowired
    StateManager stateManager;

    @GetMapping(value = "/api/states")
    public List<State> showStates() {
        return stateManager.getStates();
    }

    @GetMapping(value = "/api/states/{sid}")
    public Optional<State> getStateById(@PathVariable int sid) {
        return stateManager.getState(sid);
    }

    @PostMapping(value = "/api/states")
    public void addState(@RequestBody State state) {
    	System.out.println("Added state");
        stateManager.addState(state);
    }

    @PutMapping(value = "/api/states/{sid}")
    public void updateState(@RequestBody State state, @PathVariable int sid) {
        stateManager.update(state, sid);
    }

    
    @DeleteMapping(value = "/api/states/{sid}")
    public void deleteState(@PathVariable int sid) {
        stateManager.delete(sid);
    }
}
