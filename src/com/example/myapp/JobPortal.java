package com.example.myapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JobPortal {
    public static void  main(String[] a){
        List<Applicant> applicants = Arrays.asList(
                new Applicant("Alice", 3, Applicationstatus.SHORTLISTED),
        new Applicant("Bob", 1, Applicationstatus.SHORTLISTED),
        new Applicant("Charlie", 5, Applicationstatus.REJECTED),
        new Applicant("Diana", 4, Applicationstatus.SHORTLISTED),
         new Applicant("Ethan", 0, Applicationstatus.RECEIVED)
        );

      ApplicantFilter experienced = applicant ->   applicant.getyearsOfExperience()>2;
        System.out.println("--- Processing via Sequential Stream ---");
      // Stream Api
        List<Applicant> selected  = applicants.stream()
                .filter(n->n.getStatus()==Applicationstatus.RECEIVED)
                //.filter(n->experienced.test(n))
                .collect(Collectors.toList());

        selected.forEach(n-> System.out.println(n));


    }
}
