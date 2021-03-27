package com.example.anotacoes;

import android.content.Context;
import android.content.SharedPreferences;

import javax.microedition.khronos.egl.EGLDisplay;

public class AnotacaoPreferencias {
    private Context context;
    private SharedPreferences preferences;
    private final String NOME_ARQUIVO = "anotacao.preferencias";
    private final String CHAVE_NOME = "nome";
    private SharedPreferences.Editor editor;

    public AnotacaoPreferencias(Context c) {
        this.context = c;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();
    }

    public void salvarAnotacao(String anotacao) {
        editor.putString(CHAVE_NOME,anotacao);
        editor.commit();
    }

    public String recuperarAnotacao() {

        return preferences.getString(CHAVE_NOME,"");
    }

}
