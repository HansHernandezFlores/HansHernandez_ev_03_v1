package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Github_act extends AppCompatActivity {

    private Spinner spngh;
    private TextView tvgh;
    private String[] precios = new String[]{"5000", "12000", "45000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spngh = (Spinner)findViewById(R.id.ghSp1);
        tvgh = (TextView)findViewById(R.id.ghTv1);

        Bundle dat = getIntent().getExtras();
        String[] list = dat.getStringArray("libros");

        ArrayAdapter adapt = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);

        spngh.setAdapter(adapt);

        /*
        Al momento de seleccionar un valor en el spinner, éste no cambia. Sólo se visualiza
        el valor Farenheit (primer if). Para cumplir con el requerimiento se crea un button con la lógica.

        if (spngh.getSelectedItem().equals("Farenheit")) {
            String precio = precios[0];
            tvgh.setText("El valor de Farenheit es: " + precio);
        }
        else if (spngh.getSelectedItem().equals("Revival")) {
            String precio = precios[1];
            tvgh.setText("El valor de Revival es: " + precio);
        }
        else if (spngh.getSelectedItem().equals("El Alquimista")) {
            String precio = precios[2];
            tvgh.setText("El valor de El Alquimista es: " + precio);
        }

         */

    }

    public void Seleccionar(View view) {

        if (spngh.getSelectedItem().equals("Farenheit")) {
            String precio = precios[0];
            tvgh.setText("El valor de Farenheit es: " + precio);
        }
        else if (spngh.getSelectedItem().equals("Revival")) {
            String precio = precios[1];
            tvgh.setText("El valor de Revival es: " + precio);
        }
        else if (spngh.getSelectedItem().equals("El Alquimista")) {
            String precio = precios[2];
            tvgh.setText("El valor de El Alquimista es: " + precio);
        }
    }

}
