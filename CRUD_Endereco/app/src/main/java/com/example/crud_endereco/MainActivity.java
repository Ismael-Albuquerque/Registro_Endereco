package com.example.crud_endereco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.crud_endereco.dao.EnderecoDao;
import com.example.crud_endereco.model.Endereco;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salvar (View view){
        //pega os dados fornecidos
        EditText txt_Rua = findViewById(R.id.txt_Rua);
        EditText txt_Numero = findViewById(R.id.txt_Numero);
        EditText txt_CEP = findViewById(R.id.txt_CEP);
        EditText txt_Cidade = findViewById(R.id.txt_Cidade);
        Spinner sp_Estado = findViewById(R.id.sp_Estado);

        //encapsula na classe endereço
        Endereco endereco = new Endereco();
        endereco.setTxt_Rua(txt_Rua.getText().toString());
        endereco.setTxt_Numero(Integer.parseInt(txt_Numero.getText().toString()));
        endereco.setTxt_CEP(Integer.parseInt(txt_CEP.getText().toString()));
        endereco.setTxt_Cidade(txt_Cidade.getText().toString());
        endereco.setSp_Estado(sp_Estado.getSelectedItem().toString());

        //envia para o Dao
        new EnderecoDao().salvar(endereco);

        //Mensagem ao usuário
        Toast.makeText(getApplicationContext(),"Endereço Salvo com Sucesso",Toast.LENGTH_LONG).show();

        //Intent
        Intent intentList = new Intent(this,ListActivity.class);
        startActivity(intentList);


    }
}
