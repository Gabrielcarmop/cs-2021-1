package br.com.gilmar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AvaliacaoTest {
   private Avaliacao avaliacao;

    @Before
    public void setup(){
        avaliacao = new Avaliacao();
    }

    //Carga horaria Negativa
   @Test(expected = ValoresInvalidosException.class)
    public void cenarioCargaHorariaNegativa() throws ValoresInvalidosException {
        avaliacao.avalia(10,10,10,-5);
   }
    //Faltas Negativa
    @Test(expected = ValoresInvalidosException.class)
    public void cenarioFaltasNegativas() throws ValoresInvalidosException {
        avaliacao.avalia(10,10,-2,15);
    }
    //Nota2 Negativa
    @Test(expected = ValoresInvalidosException.class)
    public void cenarioNota2Negativa() throws ValoresInvalidosException {
        avaliacao.avalia(10,-3,0,15);
    }
    //Nota1 Negativa
    @Test(expected = ValoresInvalidosException.class)
    public void cenarioNota1Negativa() throws ValoresInvalidosException {
        avaliacao.avalia(-3,10,0,15);
    }
    //Faltas acima de 25%
    @Test
    public void cenarioReprovadoFaltas() throws ValoresInvalidosException {
        Assert.assertTrue(avaliacao.avalia(10,10,0.27,15)=="Reprovado por Falta.");
    }

    //Media abaixo de 3
    @Test
    public void cenarioReprovadoMedia() throws ValoresInvalidosException {
        Assert.assertTrue(avaliacao.avalia(2,2,0.22,15)=="Reprovado por Média.");
    }

    //Media acima de 3 e abaixo de 6
    @Test
    public void cenarioProvaExtra() throws ValoresInvalidosException {
        Assert.assertTrue(avaliacao.avalia(3,3,0.24,15)=="Prova Extra.");
    }

    //Media acima 6
    @Test
    public void cenarioAprovado() throws ValoresInvalidosException {
        Assert.assertTrue(avaliacao.avalia(6,6,0.22,15)=="Aprovado.");
    }



}
