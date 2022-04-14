package org.sid.equipement.dao.model;


import lombok.ToString;
import org.sid.equipement.dto.SousFamilleEquipDTO;

import javax.persistence.*;

@Entity(name ="SFamilleEqui" )

@ToString
//@DiscriminatorValue("SFamille")
public class SousFamilleEquipement extends EntiteGeneric {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private String marquesousfamille;



    public String getMarquesousfamille() {
        return marquesousfamille;
    }

    public void setMarquesousfamille(String marquesousfamille) {
        this.marquesousfamille = marquesousfamille;
    }

    @Override
    public SousFamilleEquipDTO convertToDTO() {
        SousFamilleEquipDTO sousFamilleEquipement = new SousFamilleEquipDTO();
        sousFamilleEquipement.setId(id);
        sousFamilleEquipement.setMarqueSFamillee(marquesousfamille);
        return sousFamilleEquipement;
    }
}
