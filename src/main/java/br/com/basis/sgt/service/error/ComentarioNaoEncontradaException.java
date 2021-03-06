package br.com.basis.sgt.service.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ComentarioNaoEncontradaException extends RuntimeException {

    public ComentarioNaoEncontradaException(Long id) {

        super("Comentário com ID " + id + " não encontrado!");

    }
}
