package es.example.appcochemovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button acceso;
    private EditText edit_usu;
    private EditText edit_contra;
    private String usuarioa;
    private String contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_usu = findViewById(R.id.usuario);
        edit_contra = findViewById(R.id.passwd);
        acceso = findViewById(R.id.acceso);
        acceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    usuarioa = edit_usu.getText().toString();
                    contrasena = edit_contra.getText().toString();
                    Usuarios usuario = new Usuarios(usuarioa, contrasena);
                    if (usuarioa.equals("oscar") && contrasena.equals("campos")){
                        Toast.makeText(MainActivity.this,"Usuario admitido", Toast.LENGTH_SHORT).show();
                        setContentView(R.layout.activity_seleccion_grado);
                    }else{
                        Toast.makeText(MainActivity.this,"Usuario incorrecto",Toast.LENGTH_SHORT).show();
                        edit_contra.setText("");
                    }
                }catch (Exception e){
                        Toast.makeText(MainActivity.this, "Error en el try", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}