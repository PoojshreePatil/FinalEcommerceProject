package FinalProject.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import FinalProject.Ecommerce.Model.Demo;
import FinalProject.Ecommerce.Services.Demoservice;

@Controller
public class DemoController {
    @Autowired
    Demoservice serv;

    @GetMapping("/welcome")
    public String display() {
        return "index";
    }

    @GetMapping("/homepage")
    public String display1() {
        return "home";
    }

    @GetMapping("/menpg")
    public String display2() {
        return "Men";
    }

    @GetMapping("/womenpg")
    public String display3() {
        return "Women";
    }

    @GetMapping("/aboutpg")
    public String display5() {
        return "About";
    }

    @GetMapping("/signuppg")
    public String display6() {
        return "signin";
    }

    @GetMapping("/login")
    public String display7() {
        return "login";
    }

    @GetMapping("/kidpg")
    public String display8() {
        return "Kids";
    }

    @PostMapping("/welcome")
    public String addpg(@ModelAttribute Demo d, Model m) {
        System.out.println(d.toString());

        // m.addAttribute("name", d.getName());

        m.addAttribute("fname", d.getFname());
        m.addAttribute("email", d.getEmail());
        m.addAttribute("password", d.getPassword());

        serv.add(d);

        return "login";

    }

    @PostMapping("/check")
    public String compare(@ModelAttribute Demo d, Model m) {

        List<Demo> dl = serv.show();

        for (Demo d1 : dl) {
            if (d1.getEmail().equals(d.getEmail()) && d1.getPassword().equals(d.getPassword())) {
                return "home";
            }
        }
        return "index";
    }

    @PostMapping("/reset")
    public String update(@ModelAttribute Demo d, Model m) {
        List<Demo> dl = serv.show();
        // m.addAttribute("data",ds.show());
        for (Demo d1 : dl) {
            if (d1.getEmail().equals(d.getEmail())) {
                d1.setPassword(d.getPassword());
                d1.setFname(d1.getFname());

                serv.add(d1);
                return "index";
            }
        }
        return "forget";

    }
}
