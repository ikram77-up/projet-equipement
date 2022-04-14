package org.sid.equipement.service.Implementation;


import org.sid.equipement.dao.model.FamilleEquipement;
import org.sid.equipement.dao.Repositories.FamilleEquiRepository;
import org.sid.equipement.dto.FamilleEquipementDTO;
import org.sid.equipement.service.FamilleequipAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FamilleEquipImpl implements FamilleequipAPI {
    @Autowired
    private FamilleEquiRepository familleEquiRepository;

    @Override
    public FamilleEquipementDTO addfamilleequip(FamilleEquipementDTO familleequipement) {
        return familleEquiRepository.save(familleequipement.convertToEntity()).convertToDTO();
    }

    @Override
    public List<FamilleEquipementDTO> gatALlfamilleequip() {
        List<FamilleEquipementDTO> familleequipement = new ArrayList<>();
        familleEquiRepository.findAll().forEach(FamilleEquipement ->
                familleequipement.add(FamilleEquipement.convertToDTO()));
        return familleequipement;
    }

    @Override
    public Optional<FamilleEquipementDTO> getfamilleequipById(Long id) {
        Optional<FamilleEquipement> get = familleEquiRepository.findById(id);
        return get.map(FamilleEquipement ::convertToDTO);
    }
}
