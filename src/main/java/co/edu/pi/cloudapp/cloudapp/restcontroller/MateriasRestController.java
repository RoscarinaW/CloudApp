package co.edu.pi.cloudapp.cloudapp.restcontroller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.pi.cloudapp.cloudapp.dto.MateriaDTO;
import co.edu.pi.cloudapp.cloudapp.services.IMateriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/materias")
public class MateriasRestController {

    @Autowired
    private IMateriaService materiaService;

    @GetMapping
    public ResponseEntity<List<MateriaDTO>> getAll() {
        return ResponseEntity.ok(materiaService.findAll());
    }

    @PostMapping
    public ResponseEntity<MateriaDTO> create(@RequestBody MateriaDTO dto) {
        MateriaDTO created = materiaService.create(dto);
        return ResponseEntity.created(URI.create("/api/materias" + created.getDescripMateria())).body(created);
    }
    
    
}
