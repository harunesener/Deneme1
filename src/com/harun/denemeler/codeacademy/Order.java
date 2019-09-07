package com.harun.denemeler.codeacademy;

public class Order {

    boolean isFilled;
    double billAmount;
    String shipping;

    //Constructor
    public Order(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        } else {
            System.out.println("Low value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
        } else {
            System.out.println("Order not ready");
        }

        System.out.println("Shipping cost: " + calculateShipping());
    }

    public double calculateShipping() {
        double shippingCost;

        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }


    public static void main(String[] args) {
        // create instances and call methods here!
        Order book = new Order(true, 25.0, "Express");
        book.ship();

    }
}

