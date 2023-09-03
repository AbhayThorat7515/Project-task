package com.global.login.Controller;

import com.global.login.dto.ProjectDto;
import com.global.login.dto.UpdateProjectDto;
import com.global.login.exception.ProjectException;
import com.global.login.exception.ResponseDto;
import com.global.login.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     *
     * it add projects
     * @param projectDto
     * @param bindingResult
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)  // We also use a POST MAPPING. @POSTMAPPING("/add")
    public ResponseEntity<?> addProject(@RequestBody ProjectDto projectDto, BindingResult bindingResult)throws Exception{
    if (bindingResult.hasErrors()){
        throw new ProjectException(bindingResult, HttpStatus.BAD_REQUEST,"Project Title Description and image is mandatory");
    }
    return  ResponseEntity.ok().body(new ResponseDto<>(HttpStatus.OK.value(),"Project Add successfully",projectService.addProject(projectDto)));
}

    /**
     * it returns all Project name
     * @return
     */
    @RequestMapping(value = "/retrieve", method = RequestMethod.GET)
    public ResponseEntity<?> getProject(){
        return ResponseEntity.ok().body(new ResponseDto<>(HttpStatus.OK.value(), "Project Name is ",projectService.getProject()));
}

    /**
     * it DELETED all projects.
     * @return
     */
    @DeleteMapping("/delete-all")
    public ResponseEntity<String> deleteAllProducts() {
        projectService.deleteAllProject();
        return ResponseEntity.ok("All Project are deleted.");
    }


    /**
     * it update the data by using id
     * @param updateProjectDto
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<?> updateProject(@RequestBody UpdateProjectDto updateProjectDto){
        return ResponseEntity.ok().body(new ResponseDto<>(HttpStatus.OK.value(),"Project Updated",projectService.updateProject(updateProjectDto)));
    }


/*    @DeleteMapping("/deleteByTitle")
    public ResponseEntity<?>deleteByTitle(@PathVariable("Title") String projectDto){
        return ResponseEntity.ok().body(new ResponseDto<>(HttpStatus.OK.value(), "Project Deleted By Title",projectService.deleteByTitle(projectDto)));
    }*/
}
