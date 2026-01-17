package com.generics.resumescreeningsystem;
import java.util.*;

//Generic Resume class
class Resume<T extends JobRole> {
 T role;

 Resume(T role) {
     this.role = role;
 }

 public void process() {
     System.out.println("Processing resume for: " + role.getRole());
 }
}

//Wildcard screening
class ScreeningPipeline {
 public static void screenAll(List<? extends JobRole> roles) {
     for (JobRole role : roles) {
         System.out.println("Screening role: " + role.getRole());
     }
 }
}

public class ResumeScreeningSystem {
 public static void main(String[] args) {

     Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
     Resume<DataScientist> r2 = new Resume<>(new DataScientist());

     r1.process();
     r2.process();

     List<JobRole> roles = new ArrayList<>();
     roles.add(new SoftwareEngineer());
     roles.add(new ProductManager());

     ScreeningPipeline.screenAll(roles);
 }
}
