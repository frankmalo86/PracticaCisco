package curso.android.cisco.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cambio

        //referenciar al view boton, por medio del objeto R
        //
        //utilizar findViewById
        Button btnIngreso = (Button)findViewById(R.id.btnIngreso);
        final TextView tvMensaje = (TextView)findViewById(R.id.tvMenjase);

        final String mensaje = getResources().getString(R.string.alerta);


        /*btnIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Otro mensaje", Toast.LENGTH_SHORT).show();
            }
        });*/
        Toast.makeText(this, "Método On Create", Toast.LENGTH_SHORT).show();

    }

    public void presionar_boton(View view){
        final String mensaje = getResources().getString(R.string.alerta);
        Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();

        EditText tvUsuario = (EditText) findViewById(R.id.tvUsuario);
        String usuario = tvUsuario.getText().toString();
        Intent intent = new Intent(this, TableLayout.class);
        String key1 = getResources().getString(R.string.parametro1);
        intent.putExtra(key1, usuario);

        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Método On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Método On Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Método On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Método On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Método On Destroy", Toast.LENGTH_SHORT).show();
    }
}
