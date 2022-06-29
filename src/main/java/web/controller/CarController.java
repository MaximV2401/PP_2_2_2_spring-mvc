package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService service;

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1, "Audi", "A8"));
        list.add(new Car(2, "BMW", "X6"));
        list.add(new Car(3, "Nissan", "Murano"));
        list.add(new Car(4, "Toyota", "Camry"));
        list.add(new Car(5, "Opel", "Astra"));
        list = service.getCarList(list, count);
        model.addAttribute("list", list);
        return "users";
    }
}
