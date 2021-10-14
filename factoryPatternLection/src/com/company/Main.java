package com.company;

public class Main {

    public static void main(String[] args) {
        TransportFactory factory = new TruckFactory();
        Transport transport = factory.createTransport();
        transport.deliver();

        factory = new ShipFactory();
        Transport transport1 = factory.createTransport();


        transport1.deliver();
    }
}
