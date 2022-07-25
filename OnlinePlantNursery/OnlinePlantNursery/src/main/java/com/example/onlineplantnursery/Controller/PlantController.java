package com.example.onlineplantnursery.Controller;

import com.example.onlineplantnursery.Entity.Plant;
import com.example.onlineplantnursery.Service.PlantServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("Plant")
public class PlantController {
    @Autowired
    private PlantServiceImpl plantServiceimpl;

    @PostMapping("/Add")
    public ResponseEntity<Plant> addPlant(@RequestBody Plant plant){
        Plant plant1 =plantServiceimpl.addPlant(plant);
        log.info("Added a new Plant ");
        log.info(String.valueOf(plant1));
        return new ResponseEntity<>(plant1, HttpStatus.CREATED);
    }
    @GetMapping("/View")
    public ResponseEntity<Plant> viewPlant(@RequestParam Long plantId){
        Plant plant = plantServiceimpl.viewPlant(plantId);
        return new ResponseEntity<>(plant,HttpStatus.ACCEPTED);
    }
    @GetMapping("/Viewall")
    public List<Plant> viewAllPlants(){
        return plantServiceimpl.viewAllPlants();
    }
    @PostMapping("/Update")
    public Plant updatePlant(@RequestBody Plant plant){
        return plantServiceimpl.updatePlant(plant);
    }
    @PostMapping("/Delete")
    public void removePlant(@RequestParam Long plantId){
        plantServiceimpl.deletePlant(plantId);
    }
    @GetMapping("/ViewByCommonName")
    public List<Plant> ViewByCommonName(@RequestParam String plantCommonName){
        return plantServiceimpl.viewAllPlants(plantCommonName);
    }
    @GetMapping("/ViewByTypeOfPlant")
    public List<Plant> ViewByTypeOfPlant(@RequestParam String typeOfPlant){
        return plantServiceimpl.viewAllPlants(typeOfPlant);
    }
}
