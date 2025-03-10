/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kinderGarden.kinderGarden.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author karol
 */
public class HorariosController {
    
       
    @Autowired
    private HorarioService  horarioService;
    
    
    @RequestMapping("/listado")
    public String listado(Model model) {
        List<Horario> Horarios = horarioService.getHorario(false);
        
        
        
        model.addAttribute("categorias",Horarios);
        model.addAttribute("totalCategorias",Horarios.size());
        return "/categoria/listado";
    }
    
}
    

