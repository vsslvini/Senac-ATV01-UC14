
package com.senac.Atividade01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("/cinema")
    public String exibirHome(){
        
        return "home";
    }
}
