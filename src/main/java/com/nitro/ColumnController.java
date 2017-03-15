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
    TableService tableService;
    @RequestMapping(value = "tables",method = RequestMethod.GET)
    public String getTables(Map<String, List<Column>> model){

        model.put("table",tableService.get100Columns());

        return "table";
    }
}
