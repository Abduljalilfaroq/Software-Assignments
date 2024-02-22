
package factorydesignpattern;

class PizzaFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Pizza();
    }
}

class SushiFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Sushi();
    }
}

