package com.smartcitytransportandservicemanagementsystem;

class TaxiService implements TransportService {

    public String getName() { return "Taxi"; }
    public double getFare() { return 120; }
    public String getRoute() { return "A-C"; }
    public int getDepartureTime() { return 7; }
}
