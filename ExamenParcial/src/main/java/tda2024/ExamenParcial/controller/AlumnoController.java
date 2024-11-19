package tda2024.ExamenParcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tda2024.ExamenParcial.endpoints.AlumnosEndpoints;
import tda2024.ExamenParcial.model.AlumnoModel;
import tda2024.ExamenParcial.services.AlumnoService;

@RestController
@RequestMapping(AlumnosEndpoints.ALUMNO_ENDPOINT)
public class AlumnoController {
    
    @Autowired
    AlumnoService alumnoService;

    @GetMapping(AlumnosEndpoints.ALUMNO_GET_ALL)
    public List<AlumnoModel> getAll(){
        return alumnoService.findAll();
    }

    @PostMapping(AlumnosEndpoints.ALUMNO_CREATE)
    public AlumnoModel create(@RequestBody AlumnoModel model){
        return alumnoService.add(model);
    }

    @GetMapping(AlumnosEndpoints.ALUMNO_GET_BY_ID)
    public AlumnoModel getById(@PathVariable int id){
        return alumnoService.findById(id);
    }
    
    @PutMapping(AlumnosEndpoints.ALUMNO_UPDATE)
    public AlumnoModel update(@RequestBody AlumnoModel model){
        return alumnoService.update(model);
    }

    @DeleteMapping(AlumnosEndpoints.ALUMNO_DELETE)
    public boolean delete(@PathVariable int id){
        return alumnoService.delete(id);
    }
}