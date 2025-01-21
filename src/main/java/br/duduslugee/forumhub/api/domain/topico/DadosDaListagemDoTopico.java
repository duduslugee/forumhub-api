package br.duduslugee.forumhub.api.domain.topico;

import java.time.LocalDateTime;

public record DadosDaListagemDoTopico(Long id, String titulo, String mensagem, String autor, String curso,
                                      LocalDateTime dataCriacao, StatusDoTopico statusDoTopico) {

    public DadosDaListagemDoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getCurso(), topico.getDataCriacao(), topico.getStatusDoTopico());
    }
}
