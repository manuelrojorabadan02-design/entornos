package com.grupoinvestigaciondam.investigacion;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public TaskService() {
        tasks.add(new Task(1, "Aprender Spring Boot", false));
        tasks.add(new Task(2, "Hacer trabajo de investigación", true));
    }

    public List<Task> getAll() {
        return tasks;
    }

    public Task add(Task task) {
        tasks.add(task);
        return task;
    }
}
