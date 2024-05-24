package es.example.appcochemovil;


import androidx.appcompat.app.AppCompatActivity;

public class Usuarios extends AppCompatActivity {

    private String usuario;
    private String contrasena;

    public Usuarios(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;

    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getContrasena(){
        return contrasena;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
}
