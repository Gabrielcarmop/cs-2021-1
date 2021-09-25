package com.company;

public class ContatoNaoEncontratoException extends Exception{
    @Override
    public String toString() {
        return "Contato não encontrado!";
    }
}
