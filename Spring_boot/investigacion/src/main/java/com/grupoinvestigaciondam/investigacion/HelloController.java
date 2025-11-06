package com.grupoinvestigaciondam.investigacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String hola() {
        return "Aquí tiene Señor Amo: el servidor funciona en 9090.";
    }
}
