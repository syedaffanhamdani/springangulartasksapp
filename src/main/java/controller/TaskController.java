package controller;

import domain.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {" ", "/"})
    public Iterable<Task> list(){

        return this.taskService.list();
    }

    @GetMapping("/save")
    public Task saveTask(@RequestBody Task task){

        return this.taskService.save(task);
    }



}
