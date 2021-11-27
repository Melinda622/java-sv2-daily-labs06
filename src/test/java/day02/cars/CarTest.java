package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car1;

    @BeforeEach
    void testInit() {
        car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
    }

    @Test
    void createCarTest() {
        assertEquals("Toyota", car1.getBrand());
        assertEquals(1.2, car1.getEngineSize());
        assertEquals(Color.BLACK, car1.getColor());
        assertEquals(2_300_000, car1.getPrice());
    }

    @Test
    void createCarTest2() {
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        assertEquals("Lamborghini", car2.getBrand());
        assertEquals(5.2, car2.getEngineSize());
        assertEquals(Color.BLACK, car2.getColor());
        assertEquals(10_300_000, car2.getPrice());
    }

    @Test
    void decreasePriceTest() {
        car1.decreasePrice(10);
        assertEquals(2070000, car1.getPrice());
    }
}