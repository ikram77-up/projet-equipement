package org.sid.equipement.service;

import org.sid.equipement.dto.LotDTO;

import java.util.List;
import java.util.Optional;

public interface LotAPI {

    LotDTO addlot(LotDTO lot);
    List<LotDTO> gatALllot();
    Optional<LotDTO> getlotById(Long id);
}
