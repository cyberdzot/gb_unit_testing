package hw02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    // проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }

    // проверка того, объект Car создается с 4-мя колесами
    @Test
    public void testCarIsFourWheels() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car.getNumWheels() == 4);
    }

    // проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotoIsTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Ducati", "SportClassic", 2006);
        assertTrue(motorcycle.getNumWheels() == 2);
    }

    // проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testCarIsSpeedTest() {
        Car car = new Car("Lada", "Калина", 2007);
        car.testDrive();
        assertTrue(car.getSpeed() == 60);
    }

    // проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void testMotoIsSpeedTest() {
        Motorcycle motorcycle = new Motorcycle("Ducati", "SportClassic", 2006);
        motorcycle.testDrive();
        assertTrue(motorcycle.getSpeed() == 75);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void testCarIsStopAfterParking() {
        Car car = new Car("Lada", "Калина", 2007);
        car.testDrive();
        car.park();
        assertTrue(car.getSpeed() == 0);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void testMotoIsStopAfterParking() {
        Motorcycle motorcycle = new Motorcycle("Ducati", "SportClassic", 2006);
        motorcycle.testDrive();
        motorcycle.park();
        assertTrue(motorcycle.getSpeed() == 0);
    }
}