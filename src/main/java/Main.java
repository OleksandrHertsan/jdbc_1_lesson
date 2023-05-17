

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        CarDao carDao = new CarDao(dataBase);

        carDao.insertCar(new Car(9, "Lamborghini", 2010, "yellow", "Italy"));

        System.out.println(carDao.getCar(9) + "\n");

        Car car = new Car(9, "Pagani", 2017, "Red", "Italy");
        carDao.updateCar(9, car);

        carDao.deleteCar(9);

        carDao.getAllCars().forEach(System.out::println);

    }
}
