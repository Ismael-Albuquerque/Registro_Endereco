package com.example.crud_endereco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.crud_endereco.dao.EnderecoDao;
import com.example.crud_endereco.model.Endereco;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Processo para utilizar ListView
        ListView listEnderecos = findViewById(R.id.listEnderecos);
        ArrayAdapter<Endereco> arrayEnderecos =
                new ArrayAdapter<>(getApplicationContext(),
                        android.R.layout.simple_list_item_1);

        List<Endereco> enderecos = new ArrayList<>();
        enderecos = new EnderecoDao().listar();

        arrayEnderecos.addAll(enderecos);

        listEnderecos.setAdapter(arrayEnderecos);

        Button btvoltar = (Button)findViewById(R.id.btn_Voltar);
        btvoltar.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Intent it = new Intent(ListActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
    }

}
