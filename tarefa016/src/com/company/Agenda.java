package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList<Contato> registros = new ArrayList<Contato>();
    String N;

    public void adicionaContato(Contato contato)  {
            this.registros.add(contato);
    }
    public void removerContato(Contato contato) {
        this.registros.remove(contato);
    }
    public void pesquisarContato(Contato contato) throws ContatoNaoEncontratoException{
        System.out.println("Digite o nome do contato a ser pesquisado: ");
        Scanner input = new Scanner(System.in);
        N=input.nextLine();
        for(int i = 0; i < registros.size(); i ++){
               if(N.equals(contato.getNome())){
                   System.out.println("Nome"+contato.getNome()+"Telefone"+contato.getTelefone()+"Email"+contato.getEmail());
            }
        }
    }

}
