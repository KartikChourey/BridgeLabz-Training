package com.JSONdata.practiceproblems;


class Car {
 String brand;
 int year;
 double price;

 Car(String brand, int year, double price) {
     this.brand = brand;
     this.year = year;
     this.price = price;
 }
}

public class CarToJson {

 public static void main(String[] args) {


     Car car = new Car("BMW", 2023, 5500000);

     
     String json =
             "{\n" +
             "  \"brand\": \"" + car.brand + "\",\n" +
             "  \"year\": " + car.year + ",\n" +
             "  \"price\": " + car.price + "\n" +
             "}";

     System.out.println(json);
 }
}
