package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCar(Integer count, List<Car> carList) {
        if (count == null) {
            return carList;
        }
        else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}