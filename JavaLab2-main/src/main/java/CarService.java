    import java.util.*;
    import java.util.stream.Collectors;

    public class CarService {

        private List<Car> carList;

        public CarService(List<Car> carList) {
            this.carList = carList;
        }

        public List<Car> findCarsByMake(String make) {
            return carList.stream()
                    .filter(car -> car.getMake().equalsIgnoreCase(make))
                    .collect(Collectors.toList());
        }

        public List<Car> sortCarsByMileage() {
            return carList.stream()
                    .sorted(Comparator.comparingInt(Car::getMileage))
                    .collect(Collectors.toList());
        }

        public Car findCarByVin(String vin) {
            return carList.stream()
                    .filter(car -> car.getVin().equals(vin))
                    .findFirst()
                    .orElse(null);
        }
    }
