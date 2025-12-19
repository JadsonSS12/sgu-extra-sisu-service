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
public class FuncionarioResponse {
    private UUID id;
    private String nome;
    private String nomeSocial;
    private String cpf;
    private String email;
    private String telefone;
    private String siape;
}