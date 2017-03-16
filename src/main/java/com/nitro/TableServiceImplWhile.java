package com.nitro;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
@Qualifier("while")
public class TableServiceImplWhile implements TableService {



    @Override
    public List<Column> get100Columns() {
        List <Column> columns = new ArrayList<Column>();
        int i=100;
        while (i>0){
             {
                columns.add(new Column(new Date().getTime(), new Random().nextLong()));
                i--;
            }
        }
        return columns;
    }
}
