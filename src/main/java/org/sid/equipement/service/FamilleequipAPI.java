package org.sid.equipement.service;

import org.sid.equipement.dto.FamilleEquipementDTO;

import java.util.List;
import java.util.Optional;

public interface FamilleequipAPI {

    FamilleEquipementDTO addfamilleequip(FamilleEquipementDTO familleequipement);
    List<FamilleEquipementDTO> gatALlfamilleequip();
    Optional<FamilleEquipementDTO> getfamilleequipById(Long id);
}
