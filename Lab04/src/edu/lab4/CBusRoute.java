package edu.lab4;

import java.util.List;
import java.util.ArrayList;

public class CBusRoute {
    private static String company;
    private int number;
    private List<CBusStop> route;

    static {
        company = "MPK Kraków";
    }
    {
        route = new ArrayList<CBusStop>();
    }

    public CBusRoute(int number) {
        this.number = number;
    }

    public void addBusStop(String name){
        route.add(new CBusStop(name));
    }
    public void addBusStop(String name, String... changes){
        route.add(new CBusStop(name, changes));
    }
    public void addBusStop(String name, int number, float nextMinutes){
        route.add(new CBusStopNext(name, number, nextMinutes));
    }
    public void addBusStop(String name, int number, float nextMinutes, String... changes){
        route.add(new CBusStopNext(name, number, nextMinutes, changes));
    }

    @Override
    public String toString(){
        String header = "POJAZD NR." + number + ". Przewoźnik: " + company + ". Trasa:" + "\n";
        StringBuilder s = new StringBuilder(header);
        for (CBusStop bs: route) {
            s.append("  Przystanek: ").append(bs.toString()).append("\n");
        }
        return s.toString();
    }

}
