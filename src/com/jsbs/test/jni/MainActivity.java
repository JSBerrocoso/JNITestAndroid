package com.jsbs.test.jni;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.jsbs.test.jni.utils.UtilsJNI;

/**
 * Actividad que muestra un botón  y al clickarlo realiza una llamada
 *  a una funcion en codigo nativo, la cual devuelve un strinng.
 * Current Time: 00:21:35 
 * Date: 21/11/2013
 * @author JSBerrocoso
 * 
 */
public class MainActivity extends Activity{

	protected static final String	TAG	= MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate( savedInstanceState);
		setContentView( R.layout.activity_main);

		Button btn = (Button) findViewById( R.id.button1);
		btn.setOnClickListener( new OnClickListener(){

			@Override
			public void onClick(View v){

				// Llamada a Native para que devuelda el string que esta en ndksample.c
				String resultJNI = UtilsJNI.getStringFromJNI();

				Log.d( TAG, TAG +resultJNI);
				((TextView) findViewById( R.id.textView1)).setText( resultJNI);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate( R.menu.main, menu);
		return true;
	}

}
