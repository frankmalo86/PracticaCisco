package curso.android.cisco.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    }

    public void presionar_boton(View view){
        final String mensaje = getResources().getString(R.string.alerta);
        Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
    }

}
