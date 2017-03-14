package com.nitro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class ColumnController {
    @Autowired
    Column column;
    @RequestMapping(value = "tables",method = RequestMethod.GET)
    public String getTables(Map<String, List<Column>> model){

        model.put("table",column.add100Columns());

        return "table";
    }
}
