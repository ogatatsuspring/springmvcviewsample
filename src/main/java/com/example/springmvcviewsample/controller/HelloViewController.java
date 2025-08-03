package com.example.springmvcviewsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping( "/hello" )
public class HelloViewController {
  
//  @GetMapping( "/view" )
  @GetMapping( "/hello/view" )
  public String helloView() {
    return "hello";
  }
  
  @GetMapping( "/hello/model" )
  public String helloView( Model model ) {
    model.addAttribute( "msg", "タイムリーフ！！！(Model)" );
    return "helloThymeleaf";
  }
  
  @GetMapping( "/hello/modelandview" )
  public ModelAndView helloView( ModelAndView mav ) {
    mav.addObject( "msg", "タイムリーフ！！！(ModelAndView)" );
    mav.setViewName( "helloThymeleaf" );
    return mav;
  }

}
