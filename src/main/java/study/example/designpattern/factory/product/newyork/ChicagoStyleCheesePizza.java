package study.example.designpattern.factory.product.newyork;

import study.example.designpattern.factory.product.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
         name = "My Style Sauce and Cheese Pizza";
         dough = "Thin Crust Dough";
         sauce = "Marinara Sauce";

         toppings.add("Grana Padano Cheese");
    }
}
