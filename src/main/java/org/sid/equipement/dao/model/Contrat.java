package org.sid.equipement.dao.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.sid.equipement.dto.ContratDTO;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contrat extends  EntiteGeneric{



    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private int numcontrat;

    @OneToOne
     Equipement equipement;


    public int getNumcontrat() {
        return numcontrat;
    }
    public void setNumcontrat(int numcontrat) {
        this.numcontrat = numcontrat;
    }

    public Equipement getEquipement() {
        return equipement;
    }

    public void setEquipement(Equipement equipement) {
        this.equipement = equipement;
    }

    @Override
    public ContratDTO convertToDTO() {
        ContratDTO contrat = new ContratDTO();
        contrat.setId(this.id);
        contrat.setNumcontrat(this.numcontrat);

        return contrat;
    }
}
