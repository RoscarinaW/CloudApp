package co.edu.pi.cloudapp.cloudapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.pi.cloudapp.cloudapp.entities.Estudiante;


public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {

}
