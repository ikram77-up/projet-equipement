package org.sid.equipement.service.Implementation;

import org.sid.equipement.dao.model.Local;
import org.sid.equipement.dao.Repositories.LocalRepository;
import org.sid.equipement.dto.LocalDTO;
import org.sid.equipement.service.LocalAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LocalImpl implements LocalAPI {
    @Autowired
    private LocalRepository localRepository;

    @Override
    public LocalDTO addlocal(LocalDTO local) {
        return localRepository.save(local.convertToEntity()).convertToDTO();
    }

    @Override
    public List<LocalDTO> gatALllocal() {
        List<LocalDTO> local = new ArrayList<>();
        localRepository.findAll().forEach(Local ->
                local.add(Local.convertToDTO()));
        return local;
    }

    @Override
    public Optional<LocalDTO> getlocalById(Long id) {
        Optional<Local> get = localRepository.findById(id);
        return get.map(Local::convertToDTO);
    }

}
