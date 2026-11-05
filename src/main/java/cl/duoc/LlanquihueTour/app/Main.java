package cl.duoc.LlanquihueTour.app;

import cl.duoc.LlanquihueTour.model.Tour;

public class Main {
    public static void main(String[] args) {

        Tour tour1 = new Tour("Volcán Osorno", "Av. Vicente Pérez Rosales 120", 912345678, "Puerto Varas");
        Tour tour2 = new Tour("Paseo Catamaran Lago Llanquihue", "Camino a Ensenada km 50", 987654321, "Puerto Varas");
        Tour tour3 = new Tour("Frutillar y Puerto Octay", "San José 45", 955667788, "Frutillar");

        System.out.println("=== TOURS DE LLANQUIHUE TOUR ===");
        System.out.println(tour1);
        System.out.println(tour2);
        System.out.println(tour3);
    }
}