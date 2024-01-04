package com.example.homework5.entity;

public class Children extends Adult{
    private int price;
    private int numberOfTickets;
    private float discount;

    //Конструктор
    public Children(int price, int numberOfTickets, float discount){
        super(price, numberOfTickets);
        this.discount = discount;
    }

    @Override
    public float ticketPriceAll(){
        return getPrice() * getNumberOfTickets() * (1 - discount);
    }
}
