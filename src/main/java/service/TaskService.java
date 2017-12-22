package service;

import domain.Task;

public interface TaskService {

    Iterable<Task> list();
    Task save(Task task);

}

