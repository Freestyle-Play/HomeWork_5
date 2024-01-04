package com.example.homework5.entity;

public class Senior extends Adult {
    private int price;
    private int numberOfTickets;
    private float discount;

    //Конструктор
    public Senior(int price, int numberOfTickets, float discount){
        super(price, numberOfTickets);
        this.discount = discount;
    }

    @Override
    public float ticketPriceAll(){
        return getPrice() * getNumberOfTickets() * (1 - discount);
    }
}
