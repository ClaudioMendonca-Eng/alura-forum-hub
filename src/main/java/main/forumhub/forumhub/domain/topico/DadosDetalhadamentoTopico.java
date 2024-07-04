package main.forumhub.forumhub.domain.topico;

import java.time.LocalDateTime;

/**
 *
 * 
 * 
 * 
 * @author <a href="https://github.com/ClaudioMendonca-Eng">Claudio Mendonça</a>
 */
public record DadosDetalhadamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao
) {
    public DadosDetalhadamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao());
    }
}
