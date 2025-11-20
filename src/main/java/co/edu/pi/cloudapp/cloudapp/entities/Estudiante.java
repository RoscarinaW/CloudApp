package co.edu.pi.cloudapp.cloudapp.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estudiantes")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Estudiante {
    @Id
    @Column(name = "id_Estudiante")
    private Long idEstudiantes;

    @Column(name = "nom_Estudiante", length = 80, nullable = false)
    private String nomEstudiante;

    @Column(name = "ape_Estudiante", length = 80, nullable = false)
    private String apeEstudiantes;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "email", length = 100, nullable = false)
    private String email;
}
