package com.upiiz.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class ControllerFacturas {
    @GetMapping("/listar")
    public String listar(){
        return "lista de facturas - sin seguridad";
    }

    @GetMapping("/actualizar")
    public String actualizar(){
        return "Factura acualizada - con seguridad";
    }

    @GetMapping("/eliminar")
    public String eliminar(){
        return "Factura eliminada - con seguridad";
    }
}
