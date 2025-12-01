package co.edu.pi.cloudapp.cloudapp.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.pi.cloudapp.cloudapp.dto.MateriaDTO;
import co.edu.pi.cloudapp.cloudapp.entities.Materia;
import co.edu.pi.cloudapp.cloudapp.repositories.IMateriaRepository;
import co.edu.pi.cloudapp.cloudapp.services.IMateriaService;

@Service
@Transactional
public class MateriaServiceImpl implements IMateriaService {
    
    @Autowired
    private IMateriaRepository repoMateria;
    private ModelMapper modelMapper;

    public MateriaServiceImpl(IMateriaRepository materiaRepository, ModelMapper modelMapper){
        this.modelMapper = modelMapper;
        this.repoMateria = materiaRepository;
    }

    @Override
    public MateriaDTO create(MateriaDTO materiaDTO) {
        Materia entidadMateria = modelMapper.map(materiaDTO, Materia.class);
        Materia saved = repoMateria.save(entidadMateria);
        return modelMapper.map(saved, MateriaDTO.class);
    }

    @Override
    public MateriaDTO update(Long id, MateriaDTO materiaDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id, MateriaDTO materiaDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

     @Override
    public MateriaDTO findByid(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findByid'");
    }

    @Override
    public List<MateriaDTO> findAll() {
       return repoMateria.findAll().stream()
       .map(e -> modelMapper.map(e, MateriaDTO.class))
       .collect(Collectors.toList());
    }
}
