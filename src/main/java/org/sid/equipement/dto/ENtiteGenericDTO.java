package org.sid.equipement.dto;

import org.sid.equipement.dao.model.EntiteGeneric;

public abstract class ENtiteGenericDTO {

    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public abstract <T extends EntiteGeneric>T convertToEntity();
}
