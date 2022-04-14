package org.sid.equipement.service.Implementation;

import org.sid.equipement.dao.model.Prestation;
import org.sid.equipement.dao.Repositories.PrestationRepository;
import org.sid.equipement.dto.PrestationDTO;
import org.sid.equipement.service.PrestationAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PrestationImpl implements PrestationAPI {
    @Autowired
    private PrestationRepository prestationRepository;

    @Override
    public PrestationDTO addprestation(PrestationDTO prestation) {
        return prestationRepository.save(prestation.convertToEntity()).convertToDTO();
    }

    @Override
    public List<PrestationDTO> gatALlprestation() {
        List<PrestationDTO> prestation = new ArrayList<>();
        prestationRepository.findAll().forEach(Prestation ->
                prestation.add(Prestation.convertToDTO()));
        return prestation;
    }

    @Override
    public Optional<PrestationDTO> getprestationById(Long id) {
        Optional<Prestation> get = prestationRepository.findById(id);
        return get.map(Prestation::convertToDTO);
    }
}
