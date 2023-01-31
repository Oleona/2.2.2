package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.ICarDAO;

@Controller
public class CarsController {
    private ICarDAO carDao;

    @Autowired
    public CarsController(ICarDAO carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String carShow(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("service", carDao.service(count));
        return "cars";
    }

}
