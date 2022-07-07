package edu.lab4;

import java.util.Arrays;

public class CBusStop {
    protected String name;
    protected String[] changes ;

    public CBusStop(String name) {
        this.name = name;
        this.changes = null;
    }

    public CBusStop(String name, String... changes) {
        this.name = name;
        this.changes = changes;
    }

    public void setChanges(String... changes){
        if(changes==null){
            return;
        }
        this.changes = changes.clone();
    }

    @Override
    public String toString(){
        if(changes==null){
            return "  Przystanek: " + name + ",  przesiadki: -brak-";
        }
        return  "  Przystanek: " + name + ",  przesiadki: " + Arrays.toString(changes);
    }
}
