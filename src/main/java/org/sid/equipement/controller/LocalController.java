package org.sid.equipement.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.sid.equipement.dto.LocalDTO;
import org.sid.equipement.service.LocalAPI;
import org.sid.equipement.swagger.SwaggerDocumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = { SwaggerDocumen.LOT_CONTROLLER_TAG})
public class LocalController {
    @Autowired
    private LocalAPI localAPI;

    //Add local
    @ApiOperation(SwaggerDocumen.ADD)
    @PostMapping(value = "/Local/ADD")
     LocalDTO addlocal(@RequestBody LocalDTO local){
        return localAPI.addlocal(local);
    }

    // afficher tous les locals ajouter
    @ApiOperation(SwaggerDocumen.LIST)
    @GetMapping(value = "/Locals")
    List<LocalDTO> getAll(){
        return localAPI.gatALllocal();

    }

    //afficher les locals par id
    @ApiOperation(SwaggerDocumen.GET)
    @GetMapping(value = "/Local/{id}")
    Optional<LocalDTO> gatById(@PathVariable Long id){
        return localAPI.getlocalById(id);
    }
}
