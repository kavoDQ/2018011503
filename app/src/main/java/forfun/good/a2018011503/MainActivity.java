package forfun.good.a2018011503;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void CL1(View v)
    {
        SharedPreferences sp = getSharedPreferences("mydata",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        EditText ed = findViewById(R.id.editText);
        editor.putString("地名",ed.getText().toString());
        editor.commit(); //123
    }

    public void CL2(View v)
    {
        SharedPreferences sp = getSharedPreferences("mydata",MODE_PRIVATE);
        String str = sp.getString("地名","");
        TextView tv = findViewById(R.id.textView);
        tv.setText(str);
    }
    public void clickset(View v)
    {
        Intent it = new Intent(MainActivity.this,SettingsActivity.class);
        startActivity(it);
    }
    public void clickread(View v)
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String str = sp.getString("mydata", "");
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(str);
    }
}
