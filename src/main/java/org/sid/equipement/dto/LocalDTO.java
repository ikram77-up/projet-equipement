package org.sid.equipement.dto;

import org.sid.equipement.dao.model.Local;

import java.util.Collection;
import java.util.List;

public class LocalDTO extends ENtiteGenericDTO{


    private String nomLocal;
    private List<EquipementDTO> equipement;

    private Collection<EquipementDTO> equipements;

    public Collection<EquipementDTO> getEquipements() {
        return equipements;
    }

    public void setEquipements(Collection<EquipementDTO> equipements) {
        this.equipements = equipements;
    }



    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

    @Override
    public Local convertToEntity() {
        Local local = new Local();
        local.setId(this.id);
        local.setNomLocal(this.nomLocal);

        return local;
    }
}
