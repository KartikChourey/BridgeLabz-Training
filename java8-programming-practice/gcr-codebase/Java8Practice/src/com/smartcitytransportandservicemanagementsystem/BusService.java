package com.smartcitytransportandservicemanagementsystem;

class BusService implements TransportService {

    public String getName() { return "Bus"; }
    public double getFare() { return 30; }
    public String getRoute() { return "A-B"; }
    public int getDepartureTime() { return 9; }
}
