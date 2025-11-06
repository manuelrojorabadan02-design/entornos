package com.grupoinvestigaciondam.investigacion;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
    private int id;
    private String description;
    private boolean completed;
}
