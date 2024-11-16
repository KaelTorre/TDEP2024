package tda2024.ExamenParcial.services;

import java.util.List;

import tda2024.ExamenParcial.model.AlumnoModel;

public interface IAlumnoService {

    public AlumnoModel add (AlumnoModel model);
    public AlumnoModel update (AlumnoModel model);
    public boolean delete (int id);
    public AlumnoModel findById (int id);
    public List<AlumnoModel> findAll ();
}
