package com.nitro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ColumnController {

@Autowired
    TableService tableService;


    @RequestMapping(value = "tables",method = RequestMethod.GET)
    public String getTables(Model model){

        model.addAttribute("table",tableService.get100Columns());

        return "table";
    }
}
