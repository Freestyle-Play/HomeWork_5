package com.example.homework5.entity;

public class Adult {
    private int price;
    private int numberOfTickets;

    //Конструктор
    public Adult(){}
    public Adult(int price, int numberOfTickets){
        this.price = price;
        this.numberOfTickets = numberOfTickets;
    }


    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
    public float ticketPriceAll(){
        return getPrice() * getNumberOfTickets();
    }
}
