package org.sid.equipement.service;

import org.sid.equipement.dto.EquipementDTO;

import java.util.List;
import java.util.Optional;

public interface EquipementAPI {

    EquipementDTO addequipement(EquipementDTO equipement);
    List<EquipementDTO> getAllequipement();
    Optional<EquipementDTO> getequipementById(Long id);
}
