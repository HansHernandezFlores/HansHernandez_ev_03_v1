package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Security_act extends AppCompatActivity {


    private TextView v1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_act);

        v1 = (TextView) findViewById(R.id.Sectv1);

    }

    public void Incidencia(View v) {

        // VULNERABILIDAD PROCESS CONTROL
        class Echo {


            public native void runEcho();

            {
                System.loadLibrary("echo"); // Se carga librería sospechosa
            }

            // ejecutamos la libería.
            public void main(String[] args) {
                new Echo().runEcho();
            }
        }

        v1.setText("PROCESS CONTROL");
    }


    public void IncidenciaDos(View v) {

        // VULNERABILIDAD SQL INYECTION

        /*

        String c;

        try {

            c = SQLiteDatabase.rawQuery("select * from usuarios where username = 'hans' and password = '123' or 1=1", null);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

         */

        v1.setText("SQL INYECTION");

    }
}