package com.example.myapplication;


        import androidx.appcompat.app.AppCompatActivity;


        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private TextView editTextText;
    private TextView editTextText2;
    private TextView editTextText3;
    private TextView editTextText4;
    private Button button2;
    private Button button4;
    private Button button5;
    private Button button6;
    private static TextView valor1;
    private static TextView valor2;
    private static TextView valor3;
    private static TextView valor4;
    private static TextView desarrollo;
    private static TextView gastronomia;
    private static TextView administracion;
    private static TextView contabilidad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.editTextText);
        valor2 = findViewById(R.id.editTextText2);
        valor3 = findViewById(R.id.editTextText3);
        valor4 = findViewById(R.id.editTextText4);
        desarrollo = findViewById(R.id.button2);
        gastronomia = findViewById(R.id.button4);
        administracion = findViewById(R.id.button5);
        contabilidad = findViewById(R.id.button6);

        desarrollo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String dato1 = valor1.getText().toString();
                String dato2 = valor2.getText().toString();
                String dato3 = valor3.getText().toString();
                String dato4 = valor4.getText().toString();
            }
        });

    }

    public void cambiar_pantalla(View view){
        Intent c = new Intent(this, MainActivity2.class);
        Bundle p = new Bundle();
        persona Da = new persona();
        startActivity(c);
    };
}