package com.global.login.services;

import com.global.login.dto.ProjectDto;
import com.global.login.dto.UpdateProjectDto;

public interface ProjectService {
        ProjectDto addProject(ProjectDto projectDto);

        Object getProject();

        Object deleteAllProject();

        UpdateProjectDto updateProject(UpdateProjectDto updateProjectDto);

        //     Object deleteByTitle(String projectDto);
}
