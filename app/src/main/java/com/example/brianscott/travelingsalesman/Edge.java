package com.example.brianscott.travelingsalesman;

/**
 * Created by Brian Scott on 5/1/2016.
 */
public class Edge
{
    private City city1;
    private City city2;
    private int distance;

    public Edge(City city1, City city2, int distance)
    {
        this.city1 = city1;
        this.city2 = city2;
        this.distance = distance;
    }

    public int getDistance()
    {
        return distance;
    }

    public City getCity1() {
        return city1;
    }


    public City getCity2() {
        return city2;
    }

}
