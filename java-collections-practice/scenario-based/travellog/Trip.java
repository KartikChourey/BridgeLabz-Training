package travellog;
import java.io.*;
import java.util.*;
import java.util.regex.*;
class Trip implements Serializable {
    String city;
    String country;
    int duration;

    Trip(String city, String country, int duration) {
        this.city = city;
        this.country = country;
        this.duration = duration;
    }
}