package org.sid.equipement.service;

import org.sid.equipement.dto.ContratDTO;

import java.util.List;
import java.util.Optional;

public interface ContratAPI {

    ContratDTO addcontrat(ContratDTO contrat);
    List<ContratDTO> gatALlcontrat();
    Optional<ContratDTO> getContratById(Long id);
}
