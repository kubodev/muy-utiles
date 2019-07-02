package co.quindio.sena.tutorialwebservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void onClick4(View view) {
        Toast.makeText(this,"Usuario registrado",Toast.LENGTH_SHORT);
        Intent intent = new Intent(RegistroActivity.this,
                LoginActivity.class);
        startActivity(intent);

        finish();
    }
}
