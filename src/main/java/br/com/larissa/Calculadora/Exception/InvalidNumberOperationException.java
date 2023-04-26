package br.com.larissa.Calculadora.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// define qual status da requisição pode ser definido se a requisição está correta ou se teve problema
@ResponseStatus(HttpStatus.BAD_REQUEST) //tratamento de erros

public class InvalidNumberOperationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidNumberOperationException(String exception) // retorna uma string contendo o erro (exception)
    {
        super(exception);
    }

}
