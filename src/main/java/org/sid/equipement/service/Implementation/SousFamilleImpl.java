package org.sid.equipement.service.Implementation;

import org.sid.equipement.dao.model.SousFamilleEquipement;
import org.sid.equipement.dao.Repositories.SouFamilleEquiRepository;
import org.sid.equipement.dto.SousFamilleEquipDTO;
import org.sid.equipement.service.SousFamilleEquipAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SousFamilleImpl implements SousFamilleEquipAPI {
    @Autowired
    private SouFamilleEquiRepository souFamilleEquiRepository;

    @Override
    public SousFamilleEquipDTO addsfamilleequip(SousFamilleEquipDTO sousFamilleEquipement) {
        return souFamilleEquiRepository.save(sousFamilleEquipement.convertToEntity()).convertToDTO();
    }

    @Override
    public List<SousFamilleEquipDTO> gatALlsfamilleequip() {
        List<SousFamilleEquipDTO> sousFamilleEquipement = new ArrayList<>();
        souFamilleEquiRepository.findAll().forEach(SousFamilleEquipement ->
                sousFamilleEquipement.add(SousFamilleEquipement.convertToDTO()));
        return sousFamilleEquipement;
    }

    @Override
    public Optional<SousFamilleEquipDTO> getsfamilleequipById(Long id) {
        Optional<SousFamilleEquipement> get = souFamilleEquiRepository.findById(id);
        return get.map(SousFamilleEquipement::convertToDTO);

    }
}
