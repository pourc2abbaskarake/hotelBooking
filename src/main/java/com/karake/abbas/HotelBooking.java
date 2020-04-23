package com.karake.abbas;

public class HotelBooking {
    private String hotelName;
    private int nbOfNights;
    private double pricePerNight;

    public HotelBooking() {
    }

    public HotelBooking(String hotelName, int nbOfNights, double pricePerNight) {
        this.hotelName = hotelName;
        this.nbOfNights = nbOfNights;
        this.pricePerNight = pricePerNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public void setNbOfNights(int nbOfNights) {
        this.nbOfNights = nbOfNights;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getTotalPrice() {
        return pricePerNight * nbOfNights;
    }
}
