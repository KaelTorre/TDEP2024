package tda2024.ExamenParcial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tda2024.ExamenParcial.model.AlumnoModel;

@Repository
public interface IAlumnoRepository extends CrudRepository<AlumnoModel, Integer>{
    
}
