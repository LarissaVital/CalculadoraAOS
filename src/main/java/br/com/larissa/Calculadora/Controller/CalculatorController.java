package br.com.larissa.Calculadora.Controller;

import br.com.larissa.Calculadora.Exception.EmptyNumberException;
import br.com.larissa.Calculadora.Exception.InvalidNumberOperationException;
import br.com.larissa.Calculadora.Model.Calculator;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@RestController
public class CalculatorController {
    @RequestMapping(value = "/sum/{n1}/{n2}", method = RequestMethod.GET)
    //rota sum com valores pra executar sem definir parametros

    public float sum(@PathVariable("n1") String n1, @PathVariable("n2") String n2) //leitura dos valores inseridos URI pra executar o metodo
    {
        if (!isBlank(n1) || !isBlank(n2)) {
            throw new EmptyNumberException("Valor vazio");
        }
        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new InvalidNumberOperationException("please, set valid numeric value");
        }
        return Calculator.sum(Float.parseFloat(n1), Float.parseFloat(n2)); //resultado da requisição pelo metodo definido na model
    }

    @RequestMapping(value = "/minus/{n1}/{n2}", method = RequestMethod.GET)
    public float minus(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {

        if (!isBlank(n1) || !isBlank(n2))
            throw new EmptyNumberException("Valor vazio");

        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new InvalidNumberOperationException("please, set valid numeric value");
        }
        return Calculator.minus(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "/multiply/{n1}/{n2}", method = RequestMethod.GET)
    public float multiply(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {

        if (!isBlank(n1) || !isBlank(n2))
                        throw new EmptyNumberException("Valor vazio");

        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new InvalidNumberOperationException("please, set valid numeric value");
        }
        return Calculator.multiply(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "/divider/{n1}/{n2}", method = RequestMethod.GET)
    public float divider(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {

            if (!isBlank(n1) || !isBlank(n2))
                throw new EmptyNumberException("Valor vazio");


            if (!isNumeric(n1) || !isNumeric(n2)){
                throw new InvalidNumberOperationException("please, set valid numeric value");
        }


        return Calculator.divider(Float.parseFloat(n1), Float.parseFloat(n2));

    }

    public boolean isNumeric(String value) {
        try {
            Float.parseFloat(value);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }


    public boolean isBlank(String value) {
      return !value.isBlank();
    }
}




//metodo para verificar o valor - branco ou nulo





