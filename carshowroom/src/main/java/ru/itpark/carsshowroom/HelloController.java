package ru.itpark.carsshowroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HelloController {
  @Autowired
  CarRepository carRepository;

  @RequestMapping("/")
  public String index() {
    return "index";
  }

  @RequestMapping("/hello")
  public List<Car> hello(Model model) {
    List<Car> list = (List<Car>) carRepository.findAll();
    return list;
  }

  @RequestMapping("/goodbye/{name}")
  public String anotherMethod(@PathVariable String name) {
    return "Goodbye, " + name;
  }


  @PostMapping("/newcar")
  public String addCar(@Param("mark") String mark,
                       @Param("model") String model) {
    System.out.println(mark + " " + model);

//    carRepository.save()
    return "redirect:/";
  }

}