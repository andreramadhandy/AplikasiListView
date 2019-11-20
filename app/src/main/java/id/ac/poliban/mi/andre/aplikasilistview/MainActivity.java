package id.ac.poliban.mi.andre.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] namaNegara = new String[]{"Indonesia", "Singapore", "Malaysia", "Italia",
            "Inggris", "Belanda", "Argentina", "Chile", "Mesir", "Uganda", "Jepang", "Jerman",
            "Vietnam", "Swedia", "Spanyol", "Australia", "Thailand"};

    @SuppressWarnings("ConstantConditions")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Aplikasi List View");

        ListView listo = findViewById(R.id.listo);
       ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namaNegara);
        listo.setAdapter(adapter);

        listo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih : "+namaNegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
