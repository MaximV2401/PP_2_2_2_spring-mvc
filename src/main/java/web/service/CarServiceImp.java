package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCarList(List<Car> list, int count) {
        if (count > 0 && count < 5) {
            return list.stream().limit(count).collect(Collectors.toList());

        } else return list;
    }
}


