package com.mvit.placementservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    // Retrieve all placements
    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    // Add a placement with manual ID assignment logic
    public Placement addPlacement(Placement placement) {
        if (placement.getId() == null) {
            // No ID provided, so we calculate the next available ID
            Long nextId = getNextAvailableId();
            placement.setId(nextId);
        } else {
            // Check if the provided ID is already in use
            if (placementRepository.existsById(placement.getId())) {
                throw new RuntimeException("ID already exists. Please provide a unique ID or leave it blank.");
            }
        }

        // Save the placement
        return placementRepository.save(placement);
    }

    // Get the next available ID
    private Long getNextAvailableId() {
        Optional<Long> maxId = placementRepository.findMaxId();
        return maxId.orElse(0L) + 1;  // If no records exist, start from 1
    }

    // Get a placement by ID
    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Placement not found"));
    }

    // Update a placement
    public Placement updatePlacement(Long id, Placement updatedPlacement) {
        Placement placement = placementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Placement not found"));

        // Update all fields, including new ones
        placement.setCompanyName(updatedPlacement.getCompanyName());
        placement.setJobTitle(updatedPlacement.getJobTitle());
        placement.setSalaryPackage(updatedPlacement.getSalaryPackage());

        // New fields
        placement.setLocation(updatedPlacement.getLocation());
        placement.setDriveDate(updatedPlacement.getDriveDate());
        placement.setJobDescription(updatedPlacement.getJobDescription());
        placement.setWorkType(updatedPlacement.getWorkType());

        return placementRepository.save(placement);
    }

    // Delete a placement
    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}
