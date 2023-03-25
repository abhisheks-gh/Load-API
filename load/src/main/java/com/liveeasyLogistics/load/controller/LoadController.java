/** This file will contain the REST API endpoints for our Load API. */

package com.liveeasyLogistics.load.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import com.liveeasyLogistics.load.dao.LoadDao;
import com.liveeasyLogistics.load.entities.Load;
import com.liveeasyLogistics.load.services.LoadService;

@RestController    
@RequestMapping()         
public class LoadController {
    // Controller works in the Presentation layer

    // Automatically injecting the object of implementation class here
    @Autowired                             // Dependency Injection
    private LoadService loadService;

    private final LoadDao loadDao;

    public List<Load> getAllLoads() {
        return loadService.getAllLoads();
    }

    // Constructor
    @Autowired
    public LoadController(LoadService loadService, LoadDao loadDao) {
        this.loadService = loadService;
        this.loadDao = loadDao;
    }

    /** Get all loads by shipperId */
    @GetMapping("/load")
    public List<Load> getLoadsByShipperId(@RequestParam UUID shipperId) {
        return loadDao.findByShipperId(shipperId);
    }

    /** Get load by loadId */
    @GetMapping("/load/{loadId}")
    public Load getLoads(@PathVariable long loadId) {
        return this.loadService.getLoads(loadId);
    }
    
    /** Add load */           
    @PostMapping("/load")
    public String addLoad(@RequestBody Load load) {
        this.loadService.addLoad(load);
        return "Load details added successfully";
    }

    /** Update load */
    @PutMapping("/load/{loadId}")
    public Load updateLoad(@RequestBody Load load) {
        return this.loadService.updateLoad(load);
    }

    /** Delete load by ID */
    @DeleteMapping("/load/{loadId}")
    public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId) {
        try {
            this.loadService.deleteLoad(Long.parseLong(loadId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
