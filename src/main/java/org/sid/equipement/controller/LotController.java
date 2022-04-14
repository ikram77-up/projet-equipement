package org.sid.equipement.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.sid.equipement.dto.LotDTO;
import org.sid.equipement.service.LotAPI;
import org.sid.equipement.swagger.SwaggerDocumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = { SwaggerDocumen.LOCAL_CONTROLLER_TAG})
public class LotController {
    @Autowired
    private LotAPI lotAPI;

    //Add lot
    @ApiOperation(SwaggerDocumen.ADD)
    @PostMapping(value = "/Lot/ADD")
    LotDTO addlot(@RequestBody LotDTO lot){
        return lotAPI.addlot(lot);
    }

    // afficher tous les lots ajouter
    @ApiOperation(SwaggerDocumen.LIST)
    @GetMapping(value = "/Lots")
    List<LotDTO> getAll(){
        return lotAPI.gatALllot();

    }

    //afficher les lots par id
    @ApiOperation(SwaggerDocumen.GET)
    @GetMapping(value = "/Lot/{id}")
    Optional<LotDTO> gatById(@PathVariable Long id){
        return lotAPI.getlotById(id);
    }
}
