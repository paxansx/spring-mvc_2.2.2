package web.controller;

import Dao.DaoImp;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serviсe.ServiceImp;
import serviсe.Serviсe;


import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value ="/cars")
    public String printCars (ModelMap model, @RequestParam(value = "count", required = false) Integer count){
        Serviсe car = new ServiceImp();
        if (count==null || count>5){
            count = car.cars().size();
        }
        model.addAttribute("car",car.getCars(car.cars(),count));

    return "cars";
}

}
