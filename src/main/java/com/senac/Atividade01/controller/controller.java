package com.senac.Atividade01.controller;

import org.springframework.ui.Model;
import com.senac.Atividade01.model.Filme;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

    private List<Filme> filmes = new ArrayList();

    @GetMapping("/cinema")
    public String exibirHome(Model model) {
        model.addAttribute("filmes", filmes);
        return "home";
    }

    @GetMapping("/cadastroFilme")
    public String exibirCadastro(Model model) {
        model.addAttribute("filme", new Filme());
        return "cadastroFilme";
    }

    @PostMapping("/cadastroFilme")
    public String processarForm(@ModelAttribute Filme filme, Model model){
        filmes.add(filme);
        model.addAttribute("filme", filme);
        return "redirect:/cinema";
        
    }
    
    
}
