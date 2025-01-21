package br.duduslugee.forumhub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosDaAtualizacaoDoTopico(

        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        String autor,
        String curso) {
}
