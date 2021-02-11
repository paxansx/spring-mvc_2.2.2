package carPackage.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import carPackage.serviсe.ServiceCar;

@Controller
public class CarsController {
    final
    ServiceCar car;

    public CarsController(ServiceCar car) {
        this.car = car;
    }

    @GetMapping(value ="/cars")
    public String printCars (ModelMap model, @RequestParam(value = "count", required = false) Integer count){
        if (count==null || count>5){
            count = car.cars().size();
        }
        model.addAttribute("car",car.getCars(car.cars(),count));

    return "cars";
}

}
