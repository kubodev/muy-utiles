package co.quindio.sena.tutorialwebservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(LoginActivity.this,
                RegistroActivity.class);
        startActivity(intent);
    }

    public void onClick(View view) {

        Intent intent = new Intent(LoginActivity.this,
                MainActivity.class);
        startActivity(intent);

    }
}
