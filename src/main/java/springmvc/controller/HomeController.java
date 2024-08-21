package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("In Home Controller");
        model.addAttribute("name","Neelam");
        model.addAttribute("id",1234);
        List<String> friends = new ArrayList<String>();
        friends.add("John");
        friends.add("Mary");
        model.addAttribute("friends",friends);
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("In About Controller");
        return "about";
    }

    @RequestMapping("/services")
    public String service() {
        System.out.println("In Service Controller");
        return "service";
    }

    @RequestMapping("/help")
    public ModelAndView help() {
        System.out.println("In Help Controller");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("help");
        modelAndView.addObject("name","Neelam");
        modelAndView.addObject("rollNo",12);
        LocalDate date = LocalDate.now();
        modelAndView.addObject("date",date);

        List<Integer> marks = new ArrayList<>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);
        modelAndView.addObject("marks",marks);

        return modelAndView;
    }


}
