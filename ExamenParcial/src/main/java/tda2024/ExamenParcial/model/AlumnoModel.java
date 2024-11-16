package tda2024.ExamenParcial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alumno")
public class AlumnoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idalumno")
    public Integer idAlumno;

    @Column(name = "nombrealumno")
    public String nombre;

    @Column(name = "notaAlumno")
    public double nota;
}
