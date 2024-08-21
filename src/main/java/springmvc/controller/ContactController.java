package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;
import springmvc.services.UserService;


@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void CommonModelData(Model m){
        m.addAttribute("Title", "Learn Coding");
        m.addAttribute("Desc","Home for Programmer");
    }

    @RequestMapping("/contact")
    public String showForm(Model m){
        m.addAttribute("Header", "Registeration Form");
        return "contact";
    }

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm (@ModelAttribute User user, Model model) {
        userService.createUser(user);
        return "success";
    }
}


/*public class ContactController {

    @RequestMapping("/contact")
    public String showForm(){
        return "contact";
    }

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm ( @RequestParam("email") String email,
                               @RequestParam("userName") String userName,
                               @RequestParam("password") String password, Model model) {


        model.addAttribute("email", email);
        model.addAttribute("userName", userName);
        model.addAttribute("password", password);

        return "success";
    }
}*/