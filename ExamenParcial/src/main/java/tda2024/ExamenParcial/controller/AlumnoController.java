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

import tda2024.ExamenParcial.model.AlumnoModel;
import tda2024.ExamenParcial.services.AlumnoService;

@RestController
@RequestMapping("alumno")
public class AlumnoController {
    
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/getAll")
    public List<AlumnoModel> getAll(){
        return alumnoService.findAll();
    }

    @PostMapping("/create")
    public AlumnoModel create(@RequestBody AlumnoModel model){
        return alumnoService.add(model);
    }

    @GetMapping("/getById/{id}")
    public AlumnoModel getById(@PathVariable int id){
        return alumnoService.findById(id);
    }
    
    @PutMapping("/update")
    public AlumnoModel update(@RequestBody AlumnoModel model){
        return alumnoService.update(model);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id){
        return alumnoService.delete(id);
    }
}
