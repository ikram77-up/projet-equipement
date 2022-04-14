package org.sid.equipement.service;

import org.sid.equipement.dto.SousFamilleEquipDTO;

import java.util.List;
import java.util.Optional;

public interface SousFamilleEquipAPI {

    SousFamilleEquipDTO addsfamilleequip(SousFamilleEquipDTO sousFamilleEquipement);
    List<SousFamilleEquipDTO> gatALlsfamilleequip();
    Optional<SousFamilleEquipDTO> getsfamilleequipById(Long id);
}
