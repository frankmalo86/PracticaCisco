package curso.android.cisco.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);


        String key1 = getResources().getString(R.string.parametro1);
        Bundle bundle = getIntent().getExtras();
        String usuario = bundle.getString(key1);

        TextView tvUsuario = (TextView)findViewById(R.id.tvUsuario);
        tvUsuario.setText("Bienvenido: " + usuario);

    }
}
