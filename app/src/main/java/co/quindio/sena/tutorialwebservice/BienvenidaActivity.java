package co.quindio.sena.tutorialwebservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BienvenidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
    }

    public void saltar(View view) {
        Intent intent = new Intent(BienvenidaActivity.this,
                LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
