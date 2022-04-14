package org.sid.equipement.dto;

import org.sid.equipement.dao.model.SousFamilleEquipement;

public class SousFamilleEquipDTO extends ENtiteGenericDTO{
    private String marqueSFamillee;


    public String getMarqueSFamillee() {
        return marqueSFamillee;
    }

    public void setMarqueSFamillee(String marqueSFamillee) {
        this.marqueSFamillee = marqueSFamillee;
    }


    @Override
    public SousFamilleEquipement convertToEntity() {
        SousFamilleEquipement sousFamilleEquipement = new SousFamilleEquipement();
        sousFamilleEquipement.setId(id);
        sousFamilleEquipement.setMarquesousfamille(marqueSFamillee);
        return sousFamilleEquipement;
    }
}
