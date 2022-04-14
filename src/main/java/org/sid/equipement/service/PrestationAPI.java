package org.sid.equipement.service;

import org.sid.equipement.dto.PrestationDTO;

import java.util.List;
import java.util.Optional;

public interface PrestationAPI {

    PrestationDTO addprestation(PrestationDTO prestation);
    List<PrestationDTO> gatALlprestation();
    Optional<PrestationDTO> getprestationById(Long id);
}
