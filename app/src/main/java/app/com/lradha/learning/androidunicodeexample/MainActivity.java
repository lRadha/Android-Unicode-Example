package app.com.lradha.learning.androidunicodeexample;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView textName = (TextView) findViewById(R.id.textName);
		Typeface face=Typeface.createFromAsset(getAssets(), "Book_Akhanake.ttf");
		textName.setTypeface(face);
	}
}
