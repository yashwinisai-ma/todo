package com.mvit.placementservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    // Retrieve all placements
    @GetMapping("/placement")
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    // Add a new placement
    @PostMapping("/placement")
    public Placement addPlacement(@RequestBody Placement placement) {
        // New fields like location, driveDate, jobDescription, and workType will automatically be handled
        return placementService.addPlacement(placement);
    }

    // Get placement by ID
    @GetMapping("/placement/{id}")
    public Placement getPlacementById(@PathVariable Long id) {
        return placementService.getPlacementById(id);
    }

    // Update placement details
    @PutMapping("/placement/{id}")
    public Placement updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
        // Updated placement will now include new fields (location, driveDate, jobDescription, workType)
        return placementService.updatePlacement(id, placement);
    }

    // Delete a placement
    @DeleteMapping("/placement/{id}")
    public void deletePlacement(@PathVariable Long id) {
        placementService.deletePlacement(id);
    }
}
