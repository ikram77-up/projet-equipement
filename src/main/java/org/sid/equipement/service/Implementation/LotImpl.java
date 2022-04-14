package org.sid.equipement.service.Implementation;


import org.sid.equipement.dao.model.Lot;
import org.sid.equipement.dao.Repositories.LotRepository;
import org.sid.equipement.dto.LotDTO;
import org.sid.equipement.service.LotAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LotImpl implements LotAPI {
    @Autowired
    private LotRepository lotRepository;


    @Override
    public LotDTO addlot(LotDTO lot) {
        return lotRepository.save(lot.convertToEntity()).convertToDTO();
    }

    @Override
    public List<LotDTO> gatALllot() {
        List<LotDTO> lot = new ArrayList<>();
        lotRepository.findAll().forEach(Lot ->
                lot.add(Lot.convertToDTO()));
        return lot;
    }

    @Override
    public Optional<LotDTO> getlotById(Long id) {
        Optional<Lot> get = lotRepository.findById(id);
        return get.map(Lot::convertToDTO);
    }
}
