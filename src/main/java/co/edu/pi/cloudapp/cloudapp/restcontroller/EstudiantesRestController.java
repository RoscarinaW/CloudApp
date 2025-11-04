package co.edu.pi.cloudapp.cloudapp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.pi.cloudapp.cloudapp.dto.EstudianteDTO;
import co.edu.pi.cloudapp.cloudapp.services.IEstudianteService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/estudiantes")
public class EstudiantesRestController {

    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping
    public ResponseEntity<List<EstudianteDTO>> getAll(){
        return ResponseEntity.ok(estudianteService.findAll());
    }

}
