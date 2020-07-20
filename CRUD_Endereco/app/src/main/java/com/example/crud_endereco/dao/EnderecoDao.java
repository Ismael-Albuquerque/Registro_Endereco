package com.example.crud_endereco.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.crud_endereco.model.Endereco;

public class EnderecoDao {

    static ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

    public void salvar (Endereco endereco) {

        enderecos.add(endereco);

    }

    public List<Endereco> listar(){
        return enderecos;

    }
}
