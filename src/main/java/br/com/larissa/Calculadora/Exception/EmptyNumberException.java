package br.com.larissa.Calculadora.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class EmptyNumberException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public EmptyNumberException(String exception)
    {
        super (exception);
    }
}
