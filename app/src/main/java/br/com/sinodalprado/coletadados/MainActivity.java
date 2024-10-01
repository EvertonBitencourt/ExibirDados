package br.com.sinodalprado.coletadados;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private EditText nomeEditText;
    private EditText profissaoEditText;
    private EditText idadeEditText;
    private TextView infoDadosTextView;
    private String infoDados;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        this.profissaoEditText = (EditText) findViewById(R.id.profissaoEditText);
        this.idadeEditText = (EditText) findViewById(R.id.idadeEditText);
        this.infoDadosTextView = (TextView) findViewById(R.id.infoDadosTextView);
        this.infoDados = getResources().getString(R.string.infoDados);
    }

    public void mostrarDados(View v){
        Editable nome = this.nomeEditText.getText();
        Editable profissao = this.profissaoEditText.getText();
        Editable idade = this.idadeEditText.getText();
        infoDados = "Seu nome é: " + nome.toString() + ", sua profissão é: " + profissao.toString() + " e sua idade é : " + idade.toString();
        this.infoDadosTextView.setText(infoDados);
    }
}
