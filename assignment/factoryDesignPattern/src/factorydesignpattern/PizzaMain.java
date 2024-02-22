
package factorydesignpattern;

 interface Dish {
    void prepare();
    void serve();
}

interface DishFactory {
    Dish createDish();
}


public class PizzaMain{
    public static void main(String[] args) {
        DishFactory pizzaFactory = new PizzaFactory();
        Dish pizza = pizzaFactory.createDish();
        pizza.prepare();
        pizza.serve();
        
        DishFactory sushiFactory = new SushiFactory();
        Dish sushi = sushiFactory.createDish();
        sushi.prepare();
        sushi.serve();
    }
}

