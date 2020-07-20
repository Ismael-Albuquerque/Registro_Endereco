package com.example.crud_endereco.model;

public class Endereco {
    //Metodos da classe Endereço
    private Long guidEndereco;
    private String txt_Rua;
    private Integer txt_Numero;
    private Integer txt_CEP;
    private String txt_Cidade;
    private String sp_Estado;

    // Ordenar o ListView
    public String toString() {
        return txt_Rua + " " + txt_Numero + " " + txt_CEP + " " + txt_Cidade + " " + sp_Estado;
    }

    //Get and Set
    public Long getGuidEndereco() {
        return guidEndereco;
    }

    public void setGuidEndereco(Long guidEndereco) {
        this.guidEndereco = guidEndereco;
    }

    public String getTxt_Rua() {
        return txt_Rua;
    }

    public void setTxt_Rua(String txt_Rua) {
        this.txt_Rua = txt_Rua;
    }

    public Integer getTxt_Numero() {
        return txt_Numero;
    }

    public void setTxt_Numero(Integer txt_Numero) {
        this.txt_Numero = txt_Numero;
    }

    public Integer getTxt_CEP() {
        return txt_CEP;
    }

    public void setTxt_CEP(Integer txt_CEP) {
        this.txt_CEP = txt_CEP;
    }

    public String getTxt_Cidade() {
        return txt_Cidade;
    }

    public void setTxt_Cidade(String txt_Cidade) {
        this.txt_Cidade = txt_Cidade;
    }

    public String getSp_Estado() {
        return sp_Estado;
    }

    public void setSp_Estado(String sp_Estado) {
        this.sp_Estado = sp_Estado;
    }



}
