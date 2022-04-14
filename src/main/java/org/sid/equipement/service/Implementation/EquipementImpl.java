package org.sid.equipement.service.Implementation;

import org.sid.equipement.dao.model.Equipement;
import org.sid.equipement.dao.Repositories.EquipementRepository;
import org.sid.equipement.dto.EquipementDTO;
import org.sid.equipement.service.EquipementAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EquipementImpl implements EquipementAPI {
    @Autowired
    private EquipementRepository equipementRepository;

    @Override
    public EquipementDTO addequipement(EquipementDTO equipement) {
        return equipementRepository.save(equipement.convertToEntity()).convertToDTO();
    }

    @Override
    public List<EquipementDTO> getAllequipement() {
        List<EquipementDTO> equipement=new ArrayList<>();
        equipementRepository.findAll().forEach(Equipement ->
                equipement.add(Equipement.convertToDTO()));
        return equipement;
    }

    @Override
    public Optional<EquipementDTO> getequipementById(Long id) {
        Optional<Equipement> get = equipementRepository.findById(id);
        return get.map(Equipement::convertToDTO);
    }

}
