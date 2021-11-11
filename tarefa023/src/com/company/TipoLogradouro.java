package com.company;

public enum TipoLogradouro {
    rua(r), avenida(av), alameda(a), marginal(m), via(v), viela(vie), travessa(t);
    private final String tipoR ;
    TipoLogradouro(String Logradouro){
        tipoR = Logradouro;
    }
    public String getTipo(){
        return tipoR;
    }
}
