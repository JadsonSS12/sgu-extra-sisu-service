package br.edu.ufape.sgu_extra_sisu_service.controller.response;

import br.edu.ufape.sgu_extra_sisu_service.model.Isencao;
import br.edu.ufape.sgu_extra_sisu_service.model.enums.StatusIsencao;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@Data
@NoArgsConstructor
public class IsencaoResponse {

    private Long id;
    private Long usuarioId;
    private Long editalId;
    private String cpf;
    private String rg;
    private Long modalidadeId;
    private List<String> documentoUrl;
    private StatusIsencao status;
    private String justificativa;

    public IsencaoResponse(Isencao obj) {
        ModelMapper modelMapper = new ModelMapper();

        this.id = obj.getId();
        this.usuarioId = obj.getUsuarioId();
        this.editalId = obj.getEdital() != null ? obj.getEdital().getId() : null;
        this.modalidadeId = obj.getModalidade() != null ? obj.getModalidade().getId() : null;
        this.documentoUrl = obj.getDocumentosUrl();
        this.status = obj.getStatus();
        this.justificativa = obj.getJustificativa();
    }

}
