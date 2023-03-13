package uqac.dim.nitflex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void afficherHello(View v){
        Log.i("DIM", "HELLO!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.menu_choix_1:

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
                TextView tv = (TextView) layout.findViewById(R.id.txt_toast);
                tv.setText("This is a custom toast");
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();

                Log.i("DIM", "choix 1");
                return true;

            case R.id.menu_choix_2:

                LayoutInflater inflater2 = getLayoutInflater();
                View layout2 = inflater2.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
                TextView tv2 = (TextView) layout2.findViewById(R.id.txt_toast);
                tv2.setText("This is an other custom toast");
                Toast toast2 = new Toast(getApplicationContext());
                toast2.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                toast2.setDuration(Toast.LENGTH_LONG);
                toast2.setView(layout2);
                toast2.show();

                Log.i("DIM", "choix 2");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}