package org.sid.equipement.dto;

import org.sid.equipement.dao.model.Lot;

import java.util.Collection;

public class LotDTO extends ENtiteGenericDTO{


    private String nomlot;
    private Collection<EquipementDTO> equipements;

    public Collection<EquipementDTO> getEquipements() {
        return equipements;
    }

    public void setEquipements(Collection<EquipementDTO> equipements) {
        this.equipements = equipements;
    }



    public String getNomlot() {
        return nomlot;
    }

    public void setNomlot(String nomlot) {
        this.nomlot = nomlot;
    }

    @Override
    public Lot convertToEntity() {
        Lot lot = new Lot();
        lot.setId(this.id);
        lot.setNomlot(this.nomlot);
        return lot;
    }
}
