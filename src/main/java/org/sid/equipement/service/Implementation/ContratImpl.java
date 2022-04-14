package org.sid.equipement.service.Implementation;

import org.sid.equipement.dao.model.Contrat;
import org.sid.equipement.dao.Repositories.ContratRepository;
import org.sid.equipement.dto.ContratDTO;
import org.sid.equipement.service.ContratAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ContratImpl implements ContratAPI {
    @Autowired
    private ContratRepository contratRepository;
    @Override
    public ContratDTO addcontrat(ContratDTO contrat) {
       return contratRepository.save(contrat.convertToEntity()).convertToDTO();

    }

    @Override
    public List<ContratDTO> gatALlcontrat() {
        List<ContratDTO> contrat=new ArrayList<>();

        contratRepository.findAll().forEach(Contrat ->
                contrat.add(Contrat.convertToDTO())
        );
        return contrat;
    }

    @Override
    public Optional<ContratDTO> getContratById(Long id) {
        Optional<Contrat> her = contratRepository.findById(id);
            return  her.map(Contrat::convertToDTO);

    }
}
