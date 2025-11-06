package com.grupoinvestigaciondam.investigacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTests {

    @Test
    void testAgregarTarea() {
        TaskService service = new TaskService();
        int sizeBefore = service.getAll().size();
        service.add(new Task(3, "Nueva tarea", false));
        assertEquals(sizeBefore + 1, service.getAll().size());
    }
}
