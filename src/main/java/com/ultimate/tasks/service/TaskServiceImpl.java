package service;

import domain.Task;
import org.springframework.stereotype.Service;
import repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {


    private TaskRepository taskRepository;


    //Spring 4.3+ does not need autowired annotation here
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
