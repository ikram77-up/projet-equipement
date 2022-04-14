package org.sid.equipement.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.sid.equipement.dto.EquipementDTO;
import org.sid.equipement.service.EquipementAPI;
import org.sid.equipement.swagger.SwaggerDocumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = { SwaggerDocumen.EQUIPEMENT_CONTROLLER_TAG})
public class EquipementController {
    @Autowired
    private EquipementAPI equipementAPI;

    //Add Equipement
    @ApiOperation(SwaggerDocumen.ADD)
    @PostMapping(value = "/Equipement/ADD")
     EquipementDTO addEquipement(@RequestBody EquipementDTO equipement){
        return equipementAPI.addequipement(equipement);
    }

    // afficher tous les equipements ajouter
    @ApiOperation(SwaggerDocumen.LIST)
    @GetMapping(value = "/Equipements")
    List<EquipementDTO> getAll(){
        return equipementAPI.getAllequipement();

    }

    //afficher les equipements par id
    @ApiOperation(SwaggerDocumen.GET)
    @GetMapping(value = "/Equipement/{id}")
    Optional<EquipementDTO> gatById(@PathVariable Long id){
        return equipementAPI.getequipementById(id);
    }
}
