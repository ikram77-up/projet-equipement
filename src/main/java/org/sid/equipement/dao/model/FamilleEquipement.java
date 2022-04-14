package org.sid.equipement.dao.model;
import lombok.ToString;
import org.sid.equipement.dto.FamilleEquipementDTO;
import javax.persistence.*;

@Entity(name = "Familleequip")

@ToString
//@DiscriminatorValue("Famille")
public class FamilleEquipement extends EntiteGeneric {


    private String marquefamille;


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarquefamille() {
        return marquefamille;
    }

    public void setMarquefamille(String marquefamille) {
        this.marquefamille = marquefamille;
    }

    @Override
    public FamilleEquipementDTO convertToDTO() {
        FamilleEquipementDTO familleEquipement = new FamilleEquipementDTO();
        familleEquipement.setId(id);
        familleEquipement.setMarquefamille(marquefamille);
        return familleEquipement;
    }
}


