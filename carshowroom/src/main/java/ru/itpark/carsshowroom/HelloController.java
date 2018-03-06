package ru.itpark.carsshowroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class HelloController {
  @Autowired
  CarRepository carRepository;

  @RequestMapping("/hello")
  public List<Car> hello() {
    List<Car> list = (List<Car>) carRepository.findAll();
    return list;
  }

  @RequestMapping("/goodbye/{name}")
  public String anotherMethod(@PathVariable String name) {
    return "Goodbye, " + name;
  }

}