package com.mvit.placementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvit.placementservice.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
