package org.sid.equipement.dto;

import org.sid.equipement.dao.model.FamilleEquipement;

public class FamilleEquipementDTO extends ENtiteGenericDTO{

    private String marquefamille;


    public String getMarquefamille() {
        return marquefamille;
    }

    public void setMarquefamille(String marquefamille) {
        this.marquefamille = marquefamille;
    }


    @Override
    public FamilleEquipement convertToEntity() {
        FamilleEquipement familleEquipement = new FamilleEquipement();
        familleEquipement.setId(id);
        familleEquipement.setMarquefamille(marquefamille);
        return familleEquipement;
    }
}
