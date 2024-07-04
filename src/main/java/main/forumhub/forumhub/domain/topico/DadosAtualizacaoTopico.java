package main.forumhub.forumhub.domain.topico;

/**
 *
 * 
 * @author <a href="https://github.com/ClaudioMendonca-Eng">Claudio Mendonça</a>
 */
public record DadosAtualizacaoTopico(
        String mensagem,
        String titulo) {
    public DadosAtualizacaoTopico(Topico topico){
        this(topico.getMensagem(), topico.getTitulo());
    }
}
