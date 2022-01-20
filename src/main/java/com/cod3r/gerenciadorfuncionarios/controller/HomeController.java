package com.cod3r.gerenciadorfuncionarios.controller;


import com.cod3r.gerenciadorfuncionarios.model.Funcionario;
import com.cod3r.gerenciadorfuncionarios.model.FuncionarioSetor;

import com.cod3r.gerenciadorfuncionarios.model.repository.FuncionarioRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class HomeController {

    @Autowired
    private FuncionarioRepository funcRepository;

    @GetMapping("/home")
    public String home(Model model) {
        Iterable<Funcionario> listaDeFuncionarios = funcRepository.findAll();
        model.addAttribute("funcionarios", listaDeFuncionarios);
        return "home";
    }

    @GetMapping("/{setor}")
    public String setor(@PathVariable("setor") String setor, Model model) {
        Iterable<Funcionario> funcionarios = funcRepository.findBySetor(FuncionarioSetor.valueOf(setor.toUpperCase()));
        model.addAttribute("funcionarios", funcionarios);
        model.addAttribute("setor", setor);
        return "home";
    }


}
