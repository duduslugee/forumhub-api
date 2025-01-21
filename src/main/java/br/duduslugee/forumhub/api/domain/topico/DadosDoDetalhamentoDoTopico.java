package br.duduslugee.forumhub.api.domain.topico;

import java.time.LocalDateTime;

public record DadosDoDetalhamentoDoTopico(Long id, String titulo, String mensagem, String curso, StatusDoTopico statusDoTopico,
                                          String autor, LocalDateTime dataCriacao) {
    public DadosDoDetalhamentoDoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getCurso(), topico.getStatusDoTopico(), topico.getAutor(), topico.getDataCriacao());
    }
}
