package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
            System.out.println("First name = " + theStudent.getFirstName());
            System.out.println("Last name = " + theStudent.getLastName());
            System.out.println("Address = " + theStudent.getAddress());

            Address tempAddress = theStudent.getAddress();
            System.out.println("Street : " + tempAddress.getStreet());

            System.out.println("Last name = " + theStudent.isActive());
            System.out.println("getLanguages = ");
            for (String tempLang : theStudent.getLanguages()) {
                System.out.println(tempLang);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
