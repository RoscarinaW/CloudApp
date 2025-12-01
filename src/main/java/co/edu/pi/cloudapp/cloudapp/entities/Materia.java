package co.edu.pi.cloudapp.cloudapp.entities;

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
@Table(name =  "materias")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Materia {
    @Id
    @Column(name = "id_materia")
    private Long idMateria;

    @Column(name = "nom_materia", length = 80, nullable = false)
    private String nomMateria;

    @Column(name = "descrip_materia", length = 150, nullable = false)
    private String descripMateria;

    @Column(name = "ciclo_materia", length = 20, nullable = false)
    private String cicloMateria;
}
