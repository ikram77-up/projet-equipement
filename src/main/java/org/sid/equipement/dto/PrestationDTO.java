package org.sid.equipement.dto;

import org.sid.equipement.dao.model.Prestation;

import java.util.Collection;

public class PrestationDTO  extends  ENtiteGenericDTO{


    private String naturePrestation;
    private Collection<EquipementDTO> equipements;

    public Collection<EquipementDTO> getEquipements() {
        return equipements;
    }

    public void setEquipements(Collection<EquipementDTO> equipements) {
        this.equipements = equipements;
    }


    public String getNaturePrestation() {
        return naturePrestation;
    }

    public void setNaturePrestation(String naturePrestation) {
        this.naturePrestation = naturePrestation;
    }

    @Override
    public Prestation  convertToEntity() {
        Prestation prestation = new Prestation();
        prestation.setId(this.id);
        prestation.setNatureprestation(this.naturePrestation);
        return  prestation;
    }
}
