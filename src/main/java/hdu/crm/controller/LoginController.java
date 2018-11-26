package hdu.crm.controller;

import hdu.crm.WebSecurityConfig;
import hdu.crm.domain.Employee;
import hdu.crm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String account,Model modoel) {

        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/loginVerify")
    public ModelAndView loginVerify(String username, String password, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        Employee emp = new Employee();
        emp.setNumber(Long.parseLong(username));
        emp.setPw(password);
        boolean verify = loginService.verifyLogin(emp);
        if (verify) {
            session.setAttribute(WebSecurityConfig.SESSION_KEY, username);
            mav.setViewName("/index");
            mav.addObject("username",username);
           // return "index";
            return  mav;
        } else {
           // model.addAttribute("info","用户名或密码错误");SecurityInterceptor
            //return "redirect:/login";
            mav.setViewName("/login");
            mav.addObject("info","用户名或密码错误");
            return  mav;

        }
    }
    /*
    @PostMapping("/loginVerify")
    public String loginVerify(String username,String password,HttpSession session){
        Employee emp = new Employee();
        emp.setNumber(Long.parseLong(username));
        emp.setPw(password);

        boolean verify = loginService.verifyLogin(emp);
        if (verify) {
            session.setAttribute(WebSecurityConfig.SESSION_KEY, username);
            return "index";
        } else {
            return "redirect:/login";
        }
    }
    */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }
    @GetMapping("/info")
    public ModelAndView info(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, ModelMap model){
        ModelAndView mav = new ModelAndView("/info.html","user",username);
        //mav.addObject("user",model.get(username)  );
        //System.out.println("username");
        System.out.println(username);

        return  mav;
    }

}
