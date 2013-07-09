package com.estima.exame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class GuardarTreinoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guardar_treino);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.guardar_treino, menu);
		return true;
	}
}
