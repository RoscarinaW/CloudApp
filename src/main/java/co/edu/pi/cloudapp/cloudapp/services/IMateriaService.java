package co.edu.pi.cloudapp.cloudapp.services;

import java.util.List;

import co.edu.pi.cloudapp.cloudapp.dto.MateriaDTO;

public interface IMateriaService {
    MateriaDTO create(MateriaDTO materiaDTO);
    MateriaDTO update(Long id, MateriaDTO materiaDTO);
    void delete(Long id, MateriaDTO materiaDTO);
    MateriaDTO findByid(Long id);
    List<MateriaDTO> findAll();

}
