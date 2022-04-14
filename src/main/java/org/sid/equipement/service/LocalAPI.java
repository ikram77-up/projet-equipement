package org.sid.equipement.service;

import org.sid.equipement.dto.LocalDTO;

import java.util.List;
import java.util.Optional;

public interface LocalAPI {

    LocalDTO addlocal(LocalDTO local);
    List<LocalDTO> gatALllocal();
    Optional<LocalDTO> getlocalById(Long id);
}
