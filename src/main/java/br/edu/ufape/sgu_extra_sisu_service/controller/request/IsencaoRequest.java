package br.edu.ufape.sgu_extra_sisu_service.controller.request;

import lombok.Data;

import java.util.List;

@Data
public class IsencaoRequest {
    private Long usuarioId;
    private Long editalId;
    private String cpf;
    private String rg;
    private Long modalidadeId;
    private List<String> documentoUrl;
}
