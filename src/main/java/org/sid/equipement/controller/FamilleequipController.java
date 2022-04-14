package org.sid.equipement.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.sid.equipement.dto.FamilleEquipementDTO;
import org.sid.equipement.service.FamilleequipAPI;
import org.sid.equipement.swagger.SwaggerDocumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = { SwaggerDocumen.FAMIILE_EQUIPEMENT_CONTROLLER_TAG})
public class FamilleequipController {
    @Autowired
    private FamilleequipAPI familleequipAPI;

    //Add Familleeqipement
    @ApiOperation(SwaggerDocumen.ADD)
    @PostMapping(value = "/Familleequip/ADD")
    FamilleEquipementDTO addEquipement(@RequestBody FamilleEquipementDTO familleequipement){
        return familleequipAPI.addfamilleequip(familleequipement);
    }

    // afficher tous les Familleeqipements ajouter
    @ApiOperation(SwaggerDocumen.LIST)
    @GetMapping(value = "/Familleequips")
    List<FamilleEquipementDTO> getAll(){
        return familleequipAPI.gatALlfamilleequip();

    }

    //afficher les Familleequipements par id
    @ApiOperation(SwaggerDocumen.GET)
    @GetMapping(value = "/Familleequip/{id}")
    Optional<FamilleEquipementDTO> gatById(@PathVariable Long id){
        return familleequipAPI.getfamilleequipById(id);
    }
}
