package com.grupoinvestigaciondam.investigacion.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Coches {

    private int id;
    private String marca;
    private String modelo;
    private String año;
}
