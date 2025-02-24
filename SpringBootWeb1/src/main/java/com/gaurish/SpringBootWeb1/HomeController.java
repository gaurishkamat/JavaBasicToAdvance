package com.gaurish.SpringBootWeb1;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/alien")
    public String alien(){
        return "alien";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, ModelAndView modelview){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = num1 + num2;

//        model.addAttribute("result", result);
        modelview.addObject("result", result);
        modelview.setViewName("result");

        return modelview;
    }

    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute Alien alien){
        return "alienresult";
    }
}
