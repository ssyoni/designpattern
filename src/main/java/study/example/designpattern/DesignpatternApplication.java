package study.example.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import study.example.designpattern.factory.creator.ChicagoPizzaStore;
import study.example.designpattern.factory.creator.NYPizzaStore;
import study.example.designpattern.factory.creator.PizzaStore;
import study.example.designpattern.factory.product.Pizza;
import study.example.designpattern.factory.product.PizzaType;

@SpringBootApplication
public class DesignpatternApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesignpatternApplication.class, args);

		PizzaStore nyStore = new NYPizzaStore();
		Pizza nyPizza = nyStore.orderPizza(PizzaType.CHEESE);

		System.out.println("주문한 "+nyPizza.getName()+"나왔습니다.");
		System.out.println("====================================");

		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		Pizza chicagoPizza = chicagoPizzaStore.orderPizza(PizzaType.VEGGIE);

		System.out.println("주문한 "+chicagoPizza.getName()+"나왔습니다.");
		System.out.println("====================================");

	}

}
