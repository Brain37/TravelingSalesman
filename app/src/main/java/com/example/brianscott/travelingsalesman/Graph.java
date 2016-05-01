package com.example.brianscott.travelingsalesman;

import android.widget.EditText;

import java.util.LinkedList;

/**
 * Created by Brian Scott on 5/1/2016.
 */
public class Graph
{
    private LinkedList<City> theCities;
    private LinkedList<Edge> theEdges;

    public Graph()
    {
        this.theCities = new LinkedList<City>();
        this.theEdges = new LinkedList<Edge>();
    }

    public void addCity(String cityName)
    {
        City city1 = new City(cityName);
        this.theCities.add(city1);
    }

    public void addEdge(String cityName, String city2Name, int distance)
    {
        for(City city: this.theCities)
        {
            if(city.getCityName().equals(Core.city2ET.getText().toString()))
            {
                for(City city2: this.theCities)
                {
                    if(city2.getCityName().equals(Core.city3.getText().toString()))
                    {
                        //if both cities are in the list of cities
                        Edge edge = new Edge(city,city2, Integer.parseInt(Core.distanceET.getText().toString()));
                        this.theEdges.add(edge);
                        return;
                    }

                }
            }

        }
        System.out.println("No Such City!");
    }


    public LinkedList<City> getTheCities()
    {
        return theCities;
    }

    public LinkedList<Edge> getTheEdges()
    {
        return theEdges;
    }

    public void display()
    {
        System.out.println("cities: ");
        for(City city : this.theCities)
        {
            System.out.println(city.getCityName());
        }
        System.out.println("edge lengths: ");
        for(Edge edge : this.theEdges)
        {
            System.out.println("City 1: " + edge.getCity1().getCityName());
            System.out.println("Is: " + edge.getDistance());
            System.out.println("From City 2: " + edge.getCity2().getCityName());
        }
    }
}
