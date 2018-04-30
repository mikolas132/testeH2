package com.micaelpereiracsw.csw.DemoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/createTable",method = RequestMethod.GET)
    public void createTable(){
        try {
            jdbcTemplate.execute("CREATE TABLE customers(" +
                    "id SERIAL, name VARCHAR(255), age VARCHAR(255))");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/putData",method = RequestMethod.GET)
    public void putData(){
        try {
            jdbcTemplate.execute("INSERT INTO customers(id,name,age) VALUES (2,'ZéDoVinho','50')");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
