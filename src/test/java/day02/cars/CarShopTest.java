package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarShopTest {
    CarShop carShop;
    Car car1;

    @BeforeEach
    void testInit() {
        car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
    }

    @Test
    void addCarsTest() {
        car1 = new Car("Toyota", 1.2, Color.BLACK, 2_30);
        carShop = new CarShop("Best Car", 10_000_000);
        carShop.addCar(car1);
        assertEquals(1, carShop.getCarsForSell().size());
    }

    @Test
    void testSumCarPrice() {
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);
        carShop = new CarShop("Best Car", 10_000_000);

        car1.decreasePrice(10);

        carShop.addCar(car1);
        carShop.addCar(car2);
        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(6270000, carShop.sumCarPrice());
    }


    @Test
    void testNumberOfCarsCheaperThan() {
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);
        carShop = new CarShop("Best Car", 10_000_000);

        carShop.addCar(car1);
        carShop.addCar(car2);
        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(1, carShop.numberOfCarsCheaperThan(2_000_000));
        assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000));
    }

    @Test
    void testCarsWithBrand() {
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);
        carShop = new CarShop("Best Car", 10_000_000);

        carShop.addCar(car1);
        carShop.addCar(car2);
        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(2, carShop.carsWithBrand("Toyota").size());
        assertEquals(0, carShop.carsWithBrand("BMW").size());
    }
}
