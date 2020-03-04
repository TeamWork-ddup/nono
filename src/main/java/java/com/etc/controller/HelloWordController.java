package java.com.etc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWordController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView( "index" );
        mv.addObject( "msg","欢迎进入springmvc界面" );
        return mv;
    }


}
