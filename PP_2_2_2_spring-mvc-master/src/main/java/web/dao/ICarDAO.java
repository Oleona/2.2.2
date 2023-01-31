package web.dao;

import web.models.Car;

import java.util.List;

public interface ICarDAO {
    List<Car> service(int count);
}
