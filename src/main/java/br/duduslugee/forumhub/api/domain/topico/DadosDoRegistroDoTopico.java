package br.duduslugee.forumhub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosDoRegistroDoTopico(

        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String autor,
        @NotBlank
        String nomeCurso,
        @NotNull
        LocalDateTime dataCriacao,
        StatusDoTopico statusDoTopico) {

    public DadosDoRegistroDoTopico {

        if (dataCriacao == null) {
            dataCriacao = LocalDateTime.now();
        }

        if (statusDoTopico == null) {
            statusDoTopico = statusDoTopico.ABERTO;
        }
    }


}
