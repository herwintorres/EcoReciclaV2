package com.example.aplicaconmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.aplicaconmovil.models.Carton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EstadisticActivity extends AppCompatActivity {
    TableLayout table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistic);
        table = findViewById(R.id.tableStadistica);
        File estadisticaFile = new File(getFilesDir(),"registro.txt");
        List<Carton> cartonList= readFile(estadisticaFile);
        addStadisticaData(cartonList);
    }

    public static List<Carton> readFile(File file){
        List<Carton> cartonList = new ArrayList<>();
        try (BufferedReader br= new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) !=null){
                String[] data = line.split(",");
                float peso = Float.parseFloat(data[0]);
                float precious = Float.parseFloat(data[1]);
                String mes = data[2];

                Carton cartonObj = new Carton(peso,precious,mes);
                cartonList.add(cartonObj);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return cartonList;
    }

    public void addStadisticaData(List<Carton> cartonList){

        for(Carton i:cartonList){
            TableRow row = new TableRow(this);
            TextView cell1 = new TextView(this);
            cell1.setText(i.getMes());
            cell1.setWidth(100);
            cell1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            //cell1.setPadding(10,10,10,10);
            cell1.setBackgroundResource(R.color.white);

            TextView cell2 = new TextView(this);
            cell2.setText("Carton");
            cell2.setWidth(90);
            cell2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            //cell2.setPadding(10,10,10,10);
            cell2.setBackgroundResource(R.color.white);

            TextView cell3 = new TextView(this);
            cell3.setText(i.getPeso()+"");
            cell3.setWidth(90);
            cell3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            //cell3.setPadding(10,10,10,10);
            cell3.setBackgroundResource(R.color.white);

            TextView cell4 = new TextView(this);
            cell4.setText(String.valueOf(i.getPrecious()));
            cell4.setWidth(70);
            cell4.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            //cell4.setPadding(10,10,10,10);
            cell4.setBackgroundResource(R.color.white);

            row.addView(cell1);
            row.addView(cell2);
            row.addView(cell3);
            row.addView(cell4);

            table.addView(row);
        }
    }
}