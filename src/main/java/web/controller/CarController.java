package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class CarController {

    private CarService carService;
    private List<Car> carList;
    private List<Car> cars;
    {
        carList = new ArrayList<>();
        carList.add(new Car("Batman", "batmobile", 999));
        carList.add(new Car("Jon", "mazda", 534));
        carList.add(new Car("Geralt", "Plotva", 1));
        carList.add(new Car("Rambo", "tank", 125));
        carList.add(new Car("Miha", "zhiguli", 431));
    }

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", required = false)Integer count, ModelMap model){
        cars = carService.getCar(count, carList);
        model.addAttribute("cars",cars);
        return "cars";
    }
}
