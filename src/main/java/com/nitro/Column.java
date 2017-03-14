package com.nitro;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Column {
    long time;
    long random;

    public Column() {
    }

    public Column(long time, long random) {
        this.time = time;
        this.random = random;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getRandom() {
        return random;
    }

    public void setRandom(long random) {
        this.random = random;
    }
    public List<Column> add100Columns(){
        List<Column> columns = new ArrayList<Column>();
        for (int i=0; i<100; i++){
            columns.add(new Column(new Date().getTime(),new Random().nextLong()));
        }
        return columns;
    }
}
