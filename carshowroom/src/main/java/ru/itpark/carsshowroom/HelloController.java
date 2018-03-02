package ru.itpark.carsshowroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class HelloController {
  @Autowired
  CarRepository carRepository;

  @RequestMapping("/hello")
  public String hello() {
    List<Car> list = (List<Car>) carRepository.findAll();
    return list.toString();
  }

  @RequestMapping("/goodbye")
  public String anotherMethod() {
    return "Bye-bye!";
  }

}