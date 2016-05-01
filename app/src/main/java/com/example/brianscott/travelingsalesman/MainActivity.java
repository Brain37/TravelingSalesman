package com.example.brianscott.travelingsalesman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Core.cityNameET = (EditText)this.findViewById(R.id.city1ET);
        Core.city2ET = (EditText)this.findViewById(R.id.city2ET);
        Core.distanceET = (EditText)this.findViewById(R.id.distanceET);
        Core.city3 = (EditText)this.findViewById(R.id.city3ET);
        Core.map = new Graph();
    }

    public void addCityButtonClicked(View v)
    {
        Core.map.addCity(Core.cityNameET.getText().toString());
        Core.cityNameET.setText("");
    }
    public void addEdgeButtonClicked(View v)
    {
        Core.map.addEdge(Core.city2ET.getText().toString(), Core.city3.getText().toString(), Integer.parseInt(Core.distanceET.getText().toString()));
        Core.city2ET.setText("");
        Core.city3.setText("");
        Core.distanceET.setText("");
    }
    public void displayButtonClicked(View v)
    {
        Core.map.display();
    }
}
