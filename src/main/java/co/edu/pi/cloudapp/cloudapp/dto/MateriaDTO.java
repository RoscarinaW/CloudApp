package co.edu.pi.cloudapp.cloudapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MateriaDTO {
    private Long idMateria;
    private String nomMateria;
    private String descripMateria;
    private String cicloMateria;
}
