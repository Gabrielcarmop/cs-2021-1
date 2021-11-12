package com.company;

import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.List;

public class CadastroEndereco implements EnderecoService{
    private String tipoEndereco; //comercial, residencial, etc.
    private String tipoLogradouro; //rua, avenida, alameda, marginal, via, viela, travessa, etc.
    private String nomeLogradouro;
    private int numero;
    private String complementoNumero; //exemplo 13-A, o complemento é -A.
    private String complementoEndereço; //quadra, lote, apartamento, etc.
    private String bairro;
    private Integer CEP;
    private String cidade;
    private String estado;
    private String pais;

    public CadastroEndereco(String tipoEndereco, String tipoLogradouro, String nomeLogradouro, int numero, String complementoNumero, String complementoEndereço, String bairro, Integer CEP, String cidade, String estado, String pais) {
        this.tipoEndereco = tipoEndereco;
        this.tipoLogradouro = tipoLogradouro;
        this.nomeLogradouro = nomeLogradouro;
        this.numero = numero;
        this.complementoNumero = complementoNumero;
        this.complementoEndereço = complementoEndereço;
        this.bairro = bairro;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }


    @Override
    public List<tipoLogradouro> consultarPorTipo(TipoLogradouro tipoLogradouro) {
       if(ListEndereco.contains(tipoLogradouro))
        return List<Endereco>;
    }

    @Override
    public List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco) {
        if(ListEndereco.contains(tipoEndereco))
            return List<Endereco>;
    }

    @Override
    public List<Endereco> consultaPorCep(int cep) {
        if(ListEndereco.contains(cep)) {
            return List < Endereco >;
        }
    }

    @Override
    public List<Endereco> consultaPorLogradouro(Logradouro logradouro) {
        if(ListEndereco.contains(logradouro))
            return List<Endereco>;
    }

    @Override
    public List<Endereco> consultaPorBairro(Bairro bairro) {
        if(ListEndereco.contains(bairro))
            return List<Endereco>;
    }

    @Override
    public List<Endereco> consultaPorCidade(Cidade cidade) {
        if(ListEndereco.contains(cidade))
            return List<Endereco>;
    }

    @Override
    public List<Cidade> listaCidadesPorEstado(Estado estado) {
        if(ListEndereco.contains(estado))
            return List<Endereco>;
    }

    @Override
    public List<Estado> consultaPorPais(Pais pais) {
        if(ListEndereco.contains(pais))
            return List<Endereco>;
    }
}
