package br.edu.ufape.sgu_extra_sisu_service.comunicacao.dto.usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlunoResponse {
    private UUID id;
    private String nome;
    private String nomeSocial;
    private String cpf;
    private String email;
    private String telefone;
    private String matricula;
    private Curso curso;
    private TipoEtnia tipoEtnia;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Curso {
        private Long id;
        private String nome;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TipoEtnia {
        private Long id;
        private String tipo;
    }
}