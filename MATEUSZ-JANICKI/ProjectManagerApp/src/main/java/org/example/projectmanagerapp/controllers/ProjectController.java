package org.example.projectmanagerapp.controllers;

import org.example.projectmanagerapp.entity.Project;
import org.example.projectmanagerapp.repository.ProjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    private final ProjectRepository repository;

    ProjectController(ProjectRepository projectRepository) {
        this.repository = projectRepository;
    }

    @GetMapping("/projects")
    List<Project> all() {
        return repository.findAll();
    }

    @PostMapping("/projects")
    Project newProject(@RequestBody Project newProject) {
        return repository.save(newProject);
    }
}