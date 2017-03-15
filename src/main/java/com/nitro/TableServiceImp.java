package com.nitro;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class TableServiceImp  implements TableService {

    @Override
    public List<Column> get100Columns() {
            List<Column> columns = new ArrayList<Column>();
            for (int i = 0; i < 100; i++) {
                columns.add(new Column(new Date().getTime(), new Random().nextLong()));
            }
            return columns;
    }
}
