package com.global.login.services.Impl;

import com.global.login.dao.ProjectRepository;
import com.global.login.dto.ProjectDto;
import com.global.login.dto.UpdateProjectDto;
import com.global.login.entities.Project;
import com.global.login.exception.CustomeException;
import com.global.login.exception.ProjectException;
import com.global.login.services.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public ProjectDto addProject(ProjectDto projectDto) {
        ProjectDto current=new ProjectDto();
        //we also manual manage but it not good practice, so we use model mapper here.
            /*Project project=new Project();
            project.setDescription(projectDto.getDescription());
            project.setImage(projectDto.getImage());
            project.setTitle(projectDto.getTitle());
            */
        Project project= modelMapper.map(projectDto, Project.class);
        Project saveProject= projectRepository.save(project);
        ProjectDto currentDto=modelMapper.map(saveProject,ProjectDto.class);
        return currentDto;
    }

    @Override
    public List<ProjectDto> getProject() {
        try {
            List<ProjectDto> projectDto = new ArrayList<>();
            List<Project> projectList = projectRepository.findAll();
            for (Project project : projectList) {
                projectDto.add(modelMapper.map(project, ProjectDto.class));
            }
            return projectDto;

        }catch (Exception e) {
                throw new CustomeException(500, "Something Happen Wrong");
        }
    }

    @Override
    public List<ProjectDto> deleteAllProject() {
     projectRepository.deleteAll();
     return null;
    }

    @Override
    public UpdateProjectDto updateProject(UpdateProjectDto updateProjectDto) {
        try {
            Project project = new Project();
            Long i = updateProjectDto.getId();
//            Optional<Project> current = projectRepository.findById(i);
          //i use java 1.8 concept in bellow
            Project project1 = projectRepository.findById(i).orElseThrow(() -> new ProjectException(HttpStatus.NOT_FOUND , "Project not found") );
                project.setId(updateProjectDto.getId());
                project.setTitle(updateProjectDto.getTitle());
                project.setDescription(updateProjectDto.getDescription());
                project.setImage(updateProjectDto.getImage());
                projectRepository.save(project);
                return updateProjectDto;

        } catch (Exception e) {
            throw new CustomeException(500, "you enter invalid id");
        }
    }
    }


