package br.com.digitalhouse.treinandomvvm.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import br.com.digitalhouse.treinandomvvm.R;

//Todo: 1º passo: criei a classe view.main.activity.class


public class HomeActivity extends AppCompatActivity {

//Todo: 3º passo: declare o recycler view
    private RecyclerView recyclerViewMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
