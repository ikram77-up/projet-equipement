package org.sid.equipement.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.sid.equipement.dto.ContratDTO;
import org.sid.equipement.service.ContratAPI;
import org.sid.equipement.swagger.SwaggerDocumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = { SwaggerDocumen.CONTRAT_CONTROLLER_TAG})
public class ContratController {
    @Autowired
    private ContratAPI contratAPI;
    //Add Contrat
    @ApiOperation(SwaggerDocumen.ADD)
    @PostMapping(value = "/Contrat/ADD")
     ContratDTO addContrat(@RequestBody ContratDTO contrat){
        return contratAPI.addcontrat(contrat);
    }

    // afficher tous les contrats ajouter
    @ApiOperation(SwaggerDocumen.LIST)
    @GetMapping(value = "/Contrats")
    List<ContratDTO> getAll(){
        return contratAPI.gatALlcontrat();

    }

    //afficher les contrat par id

    @ApiOperation(SwaggerDocumen.GET)
    @GetMapping(value = "/Contrat/{id}")
    Optional<ContratDTO> gatById(@PathVariable Long id){
        return contratAPI.getContratById(id);
    }
}
