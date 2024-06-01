package com.gehendra.demo;
import java.util.LinkedList;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NameController {
    @GetMapping("/lol")
    public String Lol(){
       String y="Hello";
       String x="World";
       return y+x;
    }
    @GetMapping("/Combine")cd
    public String Combine(){
        String z= "Gehendra";
        String y= "chaudhdary";
        return z+y;
    }
    @GetMapping("/LinkedList")
    public String LinkedList(){
        LinkedList<String>ll=new LinkedList<>();
        ll.add("Gehendra");
        ll.add("Sagar");
        ll.add("Raghav");
        return ll.toString();
    }

}
