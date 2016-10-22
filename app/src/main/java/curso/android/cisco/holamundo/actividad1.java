package curso.android.cisco.holamundo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
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

}
