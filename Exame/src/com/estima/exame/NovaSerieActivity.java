package com.estima.exame;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class NovaSerieActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nova_serie);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nova_serie, menu);
		return true;
	}
	
	public void salvarSerie(View view){
//		Método que salva a nova série no database e chama mainActivity
		
		Intent intent = new Intent(this, MainActivity.class);
    	startActivity(intent);
	}

}
