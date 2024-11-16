package tda2024.ExamenParcial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
public class AlumnoModel {

    public Integer idAlumbos;


    public String nombre;

    
    public double nota;
}
