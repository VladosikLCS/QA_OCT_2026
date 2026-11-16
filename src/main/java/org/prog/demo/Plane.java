package org.prog.demo;

public class Plane {
    int flightId; //Номер рейса
    int maximumPassengerSeats;// максимальное количество пассажирских мест
    int takenPassengerSeats;// количество занятых мест

    public void printFlightInfo() {
        System.out.println("На рейсе " + flightId
                + " занято " + takenPassengerSeats + " мест");
    }

    public static void main(String[] args) {
        Plane plane = new Plane();// создаём объект
        plane.flightId = 174;// задаём номер рейса
        plane.maximumPassengerSeats = 150;// задаём вместимость
        plane.takenPassengerSeats = 70;// задаём количество занятых мест
        plane.printFlightInfo();// вызываем метод вывода информации
    }
}
