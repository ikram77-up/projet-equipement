package org.sid.equipement.dao.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.sid.equipement.dto.PrestationDTO;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Prestation extends EntiteGeneric{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @NotNull
    private String natureprestation;

    @OneToMany(mappedBy = "prestation")
    private Collection<Equipement> equipements;



    public String getNatureprestation() {
        return natureprestation;
    }

    public void setNatureprestation(String natureprestation) {
        this.natureprestation = natureprestation;
    }

    public Collection<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(Collection<Equipement> equipements) {
        this.equipements = equipements;
    }

    @Override
    public PrestationDTO convertToDTO() {
        PrestationDTO prestation = new PrestationDTO();
        prestation.setId(this.id);
        prestation.setNaturePrestation(this.natureprestation);
        return prestation;
    }
}
