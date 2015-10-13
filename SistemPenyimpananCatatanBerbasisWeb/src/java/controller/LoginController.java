/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.LoginService;

/**
 *
 * @author LabGSG-15
 */
public class LoginController extends SimpleFormController {
    
    public LoginController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        
        
    setCommandClass(Login.class);  
    setCommandName("log");
    setSuccessView("loginView");
    setFormView("formLoginView");

    }
    
    @Override
   protected ModelAndView onSubmit(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command,
            BindException errors) throws Exception {

        Login log = (Login) command;
        
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("helloMessage", helloService.sayHello(log.getUsername()));
       
        return mv;
}
    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
     @Override
     protected ModelAndView onSubmit(
     HttpServletRequest request, 
     HttpServletResponse response, 
     Object command, 
     BindException errors) throws Exception {
     ModelAndView mv = new ModelAndView(getSuccessView());
     //Do something...
     return mv;
     }
     */

    private LoginService helloService;
    
     public void setHelloService(LoginService helloService) {
    this.helloService = helloService;
}
}
