package com.company;

public enum TipoEndereco {
    COMERCIAL(C), RESIDENCIAL(R);
    private final String tipo ;
      TipoEndereco(String endereco){
        tipo = endereco;
    }
    public String getTipo(){
        return tipo;
    }
}
