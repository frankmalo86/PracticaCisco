package curso.android.cisco.holamundo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        ImageView miImagen = (ImageView)findViewById(R.id.imgMiImagen);
        registerForContextMenu(miImagen);

    }


    public void enviarMail(View v){
        String email = "frankmalo86@gmail.com";
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, email);
        //puedo tener más opciones // cc, subject, etc.
        emailIntent.setType("message/rfc822");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Mi primer mail desde Android");
        startActivity(Intent.createChooser(emailIntent, "Email"));
    }


    public void irA(View view){
        Intent intent = null;

        switch (view.getId()){
            case R.id.btn1:
                intent = new Intent(this, actividad2.class);
                break;
            case R.id.btn2:
                intent = new Intent(this, actividad3.class);
                break;
            case R.id.btn3:
                intent = new Intent(this, actividad4.class);
                break;

        }

        if (intent != null) startActivity(intent);
    }

    /************************* menu de opciones **************************/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opiciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent = null;
        switch (item.getItemId()){
            case R.id.mnActividad1:
                intent = new Intent(this, actividad2.class);
                break;
            case R.id.mnActividad2:
                intent = new Intent(this, actividad3.class);
                break;
            case R.id.mnActividad3:
                intent = new Intent(this, actividad4.class);
                break;
        }

        if (intent != null) startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

    /*******************************************************************/
    /************************* menu de contexto **************************/

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_opiciones, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()){
            case R.id.mnActividad1:
                intent = new Intent(this, actividad2.class);
                break;
            case R.id.mnActividad2:
                intent = new Intent(this, actividad3.class);
                break;
            case R.id.mnActividad3:
                intent = new Intent(this, actividad4.class);
                break;
        }

        if (intent != null) startActivity(intent);
        return super.onContextItemSelected(item);
    }

    /*******************************************************************/
    /************************* menu de popup **************************/


    public void levantarMenuPopUp(View v){
        //ImageView imagen = (ImageView) findViewById(R.id.imgImagen);
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.getMenuInflater().inflate(R.menu.menu_opiciones, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = null;
                switch (item.getItemId()){
                    case R.id.mnActividad1:
                        intent = new Intent(actividad1.this, actividad2.class);
                        break;
                    case R.id.mnActividad2:
                        intent = new Intent(actividad1.this, actividad3.class);
                        break;
                    case R.id.mnActividad3:
                        intent = new Intent(actividad1.this, actividad4.class);
                        break;
                }

                if (intent != null) startActivity(intent);
                return true;
            }
        });

        popupMenu.show();
    }

}














