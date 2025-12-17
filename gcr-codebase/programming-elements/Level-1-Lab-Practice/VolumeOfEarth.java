public class VolumeOfEarth {
    public static void main(String[] args) {

        // Radius of Earth in kilometers
        double radiusKm = 6378;

        // Value of Pi
        double pi = Math.PI;

        // Calculating volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Converting radius from km to miles
        double radiusMiles = radiusKm / 1.6;

        // Calculating volume in cubic miles
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        // Displaying output
        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm +
            " and cubic miles is " + volumeMiles
        );
    }
}
