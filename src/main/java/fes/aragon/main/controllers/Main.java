package fes.aragon.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fes.aragon.main.models.StudentInfo;

@Controller
public class Main {

    @GetMapping("/")
    public String getMainView(Model model) {
        final StudentInfo student = new StudentInfo("Diego", "Jesus Cabrera", "Ing. de Software", 2610);
        model.addAttribute("student", student);
        return "index/index";
    }
}
