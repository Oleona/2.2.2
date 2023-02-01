package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static List<Car> listCars = new ArrayList<>();

    {
        listCars.add(new Car("LandRover", "Discovery", 13));
        listCars.add(new Car(" Mitsubishi", "Pajero", 29));
        listCars.add(new Car("Moskvich2125", "Izh-Combi", 45));
        listCars.add(new Car("Volkswagen", "Passat", 25));
        listCars.add(new Car("Noname", "Nomodel", 1));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0 || count > 5) {
            count = 5;
        }
        return listCars.stream().limit(count).toList();
    }


}
