package service;

import domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface TaskService {

    Iterable<Task> list();
    Task save(Task task);

}

