package com.mvit.placementservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlacementService {

	
		
		@Autowired
	    private PlacementRepository PlacementRepository;

	    // Retrieve all placements
	    public List<Placement> getAllPlacements() {
	        return PlacementRepository.findAll();
	    }

	    // Add a placement
	    public Placement addPlacement(Placement placement) {
	        return PlacementRepository.save(placement);
	    }

	    // Get a placement by ID
	    public Placement getPlacementById(Long id) {
	        return PlacementRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Placement not found"));
	    }

	    // Update a placement
	    public Placement updatePlacement(Long id, Placement updatedPlacement) {
	        Placement placement = PlacementRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Placement not found"));
	        
	        placement.setCompanyName(updatedPlacement.getCompanyName());
	        placement.setJobTitle(updatedPlacement.getJobTitle());
	        placement.setSalaryPackage(updatedPlacement.getSalaryPackage());
	        
	        return PlacementRepository.save(placement);
	    }

	    // Delete a placement
	    public void deletePlacement(Long id) {
	        PlacementRepository.deleteById(id);
	    }

	}


