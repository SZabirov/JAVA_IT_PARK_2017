package ru.itpark.carsshowroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class HelloController {
  @Autowired
  CarRepository carRepository;

  @RequestMapping("/")
  public String index() {
    return "index";
  }

  @RequestMapping("/hello")
  public String hello(Model model) {
    List<Car> list = (List<Car>) carRepository.findAll();
    model.addAttribute("cars", list);
    return "hello";
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

  @PostMapping("/updatecar")
  String updateCar(@Param("id") Long id,
                   @Param("mark") String mark,
                   @Param("model") String model,
                   @Param("price") Integer price,
                   @Param("color") String color) {
    Car car = carRepository.findById(id).get();
    if (mark != null && !mark.isEmpty()) {
      car.setMark(mark);
    }
    if (model != null && !model.isEmpty()) {
      car.setModel(model);
    }
    if (price != null) {
      car.setPrice(price);
    }
    if (color != null && !color.isEmpty()) {
      car.setColor(color);
    }
    carRepository.save(car);
    return "redirect:/hello";
  }


}