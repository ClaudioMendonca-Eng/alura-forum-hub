package main.forumhub.forumhub.domain.resposta;

import java.time.LocalDateTime;

/**
 *
 * 
 * @author <a href="https://github.com/ClaudioMendonca-Eng">Claudio Mendonça</a>
 */
public record DadosDetalhadamentoResposta(
        Long id,
        String nome,
        Long autor_Id,
        Long idTopico,
        LocalDateTime dataCriacao,
        String sugestao,
        StatusResposta status

        ) {

    public DadosDetalhadamentoResposta(Resposta resposta){
        this(resposta.getId(), resposta.getNome(), resposta.getAutor().getId(),resposta.getTopico().getId(), resposta.getDataCriacao(), resposta.getMensagem(), resposta.getStatus());
    }
}
