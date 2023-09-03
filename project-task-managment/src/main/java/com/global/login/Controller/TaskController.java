package com.global.login.Controller;

import com.global.login.dto.TaskDto;
import com.global.login.dto.UpdateTaskDto;
import com.global.login.exception.ProjectException;
import com.global.login.exception.ResponseDto;
import com.global.login.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Task")
public class TaskController {

    @Autowired
    public TaskService taskService;

    /**
     * it add task and also mention project
     * @param taskDto
     * @param bindingResult
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)  // We also use a POST MAPPING. @POSTMAPPING("/add")
    public ResponseEntity<?> addTask(@RequestBody TaskDto taskDto,BindingResult bindingResult)throws Exception{
        if (bindingResult.hasErrors()){
            throw new ProjectException(bindingResult, HttpStatus.BAD_REQUEST,"Task status is mandatory");
        }
        return  ResponseEntity.ok().body(new ResponseDto<>(HttpStatus.OK.value(),"Task Add successfully",taskService.addTask(taskDto)));
    }


    /**
     * it delete all task
     * @return
     */
    @DeleteMapping("/delete-all")
    public ResponseEntity<String> deleteAllTask() {
        taskService.deleteAllTask();
        return ResponseEntity.ok("All Task deleted.");
    }

    /**
     * update the status of task
     * @param updateTaskDto
     * @return
     */
    @RequestMapping(value = "/updateTask",method = RequestMethod.PUT)
    public ResponseEntity<?> updateTask(@RequestBody UpdateTaskDto updateTaskDto){
        return ResponseEntity.ok().body(new ResponseDto<>(HttpStatus.OK.value(),"Task Updated",taskService.updateTask(updateTaskDto)));
    }
}
