package com.grupoinvestigaciondam.investigacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> obtenerTareas() {
        return taskService.getAll();
    }

    @PostMapping
    public Task crearTarea(@RequestBody Task task) {
        return taskService.add(task);
    }
}
