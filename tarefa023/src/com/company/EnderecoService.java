package com.company;

import java.util.List;

public interface EnderecoService {
public List<TipoLogradouro> consultarPorTipo(TipoLogradouro tipoLogradouro);
public List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco);
public List<Endereco> consultaPorCep(int cep);
public List<Endereco> consultaPorLogradouro(Logradouro logradouro);
public List<Endereco> consultaPorBairro(Bairro bairro);
public List<Endereco> consultaPorCidade(Cidade cidade);
public List<Cidade> listaCidadesPorEstado(Estado estado);
public List<Estado> consultaPorPais();
}
