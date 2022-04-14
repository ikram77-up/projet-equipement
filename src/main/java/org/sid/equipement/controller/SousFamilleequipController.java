package org.sid.equipement.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.sid.equipement.dto.SousFamilleEquipDTO;
import org.sid.equipement.service.SousFamilleEquipAPI;
import org.sid.equipement.swagger.SwaggerDocumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = { SwaggerDocumen.SOUS_FAMILLEE_QUIPEMENT_CONTROLLER_TAG})
public class SousFamilleequipController {
    @Autowired
    private SousFamilleEquipAPI sousFamilleEquipAPI;

    //Add SousFamilleequip
    @ApiOperation(SwaggerDocumen.ADD)
    @PostMapping(value = "/SousFamilleequip/ADD")
    SousFamilleEquipDTO addEquipement(@RequestBody SousFamilleEquipDTO sousFamilleequipement){
        return sousFamilleEquipAPI.addsfamilleequip(sousFamilleequipement);
    }

    // afficher tous les SousFamilleequips
    @ApiOperation(SwaggerDocumen.LIST)
    @GetMapping(value = "/SousFamilleequips")
    List<SousFamilleEquipDTO> getAll(){
        return sousFamilleEquipAPI.gatALlsfamilleequip();

    }

    //afficher les SousFamilleequips par id
    @ApiOperation(SwaggerDocumen.GET)
    @GetMapping(value = "/SousFamilleequip/{id}")
    Optional<SousFamilleEquipDTO> gatById(@PathVariable Long id){
        return sousFamilleEquipAPI.getsfamilleequipById(id);
    }
}
