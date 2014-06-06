package jp.ac.st.asojuku.original2014002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		Intent intent = null;
		switch(v.getId()) {
			case R.id.bt1:
				intent = new Intent(MainActivity.this, EntryActivity.class);
				startActivity(intent);
				break;

			case R.id.bt3:
				intent = new Intent(MainActivity.this, ListActivity.class);
				startActivity(intent);
				break;

		}


	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ

		Button bt1 = (Button)findViewById(R.id.bt1);
		bt1.setOnClickListener(this);

		Button bt2 = (Button)findViewById(R.id.bt2);
		bt2.setOnClickListener(this);

		Button bt3 = (Button)findViewById(R.id.bt3);
		bt3.setOnClickListener(this);
		super.onResume();
	}



}
