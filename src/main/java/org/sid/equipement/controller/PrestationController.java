package org.sid.equipement.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.sid.equipement.dto.PrestationDTO;
import org.sid.equipement.service.PrestationAPI;
import org.sid.equipement.swagger.SwaggerDocumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = { SwaggerDocumen.PRESTATION_CONTROLLER_TAG})
public class PrestationController {
    @Autowired
    private PrestationAPI prestationAPI;

    //Add Prestation
    @ApiOperation(SwaggerDocumen.ADD)
    @PostMapping(value = "/Prestation/ADD")
    PrestationDTO addEquipement(@RequestBody PrestationDTO prestation){
        return prestationAPI.addprestation(prestation);
    }

    // afficher tous les Prestations ajouter
    @ApiOperation(SwaggerDocumen.LIST)
    @GetMapping(value = "/Prestations")
    List<PrestationDTO> getAll(){
        return prestationAPI.gatALlprestation();

    }

    //afficher les Prestations par id
    @ApiOperation(SwaggerDocumen.GET)
    @GetMapping(value = "/Prestation/{id}")
    Optional<PrestationDTO> gatById(@PathVariable Long id){
        return prestationAPI.getprestationById(id);
    }
}
