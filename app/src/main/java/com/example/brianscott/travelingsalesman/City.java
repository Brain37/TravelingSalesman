package com.example.brianscott.travelingsalesman;

import java.util.LinkedList;

/**
 * Created by Brian Scott on 5/1/2016.
 */
public class City
{
    private String cityName;
    private LinkedList<Edge> theEdges;

    public City(String cityName)
    {
        this.cityName = cityName;
        this.theEdges = new LinkedList<Edge>();
    }

    public String getCityName()
    {
        return cityName;
    }

}
