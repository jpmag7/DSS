package com.SistemaReparações.LogicaDeNegocios.Exceptions;

public class EquipamentoInexistenteException extends Exception{
    public EquipamentoInexistenteException(){
        super();
    }

    public EquipamentoInexistenteException(String s){
        super(s);
    }
}
