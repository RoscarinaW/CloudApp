package co.edu.pi.cloudapp.cloudapp.services;

import java.util.List;

import co.edu.pi.cloudapp.cloudapp.dto.EstudianteDTO;

public interface IEstudianteService {
    EstudianteDTO create(EstudianteDTO estudianteDTO);
    EstudianteDTO update(Long id, EstudianteDTO estudianteDTO);
    void delete(Long id, EstudianteDTO estudianteDTO);
    EstudianteDTO findByid(Long id);
    List<EstudianteDTO> findAll();
}
