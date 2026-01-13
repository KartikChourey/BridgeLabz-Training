package smartcheckout;

import java.util.*;

//Represents a customer
class Customer {
 String name;
 List<String> items;

 Customer(String name, List<String> items) {
     this.name = name;
     this.items = items;
 }
}