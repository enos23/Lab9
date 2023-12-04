package org.example_;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksionExample {
    public static void main(String args[]) throws Exception {
        Student std = new Student();
        std.setId(001);
        std.setName("Krishna");
        std.setAge(30);
        std.setPhone(9848022338L);
        //Creating the ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();
        //Converting the Object to JSONString
        String jsonString = mapper.writeValueAsString(std);
        System.out.println(jsonString);
    }
}