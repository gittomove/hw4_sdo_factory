package com.company;

public class TruckFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        //
        return new Truck();
    }
}
