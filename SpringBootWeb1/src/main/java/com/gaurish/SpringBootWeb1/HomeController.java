package com.gaurish.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, Model model){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = num1 + num2;

        model.addAttribute("result", result);
        return "result.jsp";
    }
}
