package com.mvit.placementservice;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlacementRepository extends JpaRepository<Placement, Long> {

    // Query to find the maximum ID in the placement table
    @Query("SELECT MAX(p.id) FROM Placement p")
    Optional<Long> findMaxId();
}
