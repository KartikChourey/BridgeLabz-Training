package com.smartcitytransportandservicemanagementsystem;

class MetroService implements TransportService {

    public String getName() { return "Metro"; }
    public double getFare() { return 50; }
    public String getRoute() { return "A-D"; }
    public int getDepartureTime() { return 8; }
}
