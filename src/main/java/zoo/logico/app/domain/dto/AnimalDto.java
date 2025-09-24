package zoo.logico.app.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record AnimalDto (
        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @Positive(message = "A idade precisa ser maior que 0")
        int idade,

        Boolean nascidoEmCativeiro
) {

}
