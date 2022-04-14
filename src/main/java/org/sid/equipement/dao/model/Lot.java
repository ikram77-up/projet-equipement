package org.sid.equipement.dao.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.sid.equipement.dto.LotDTO;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lot extends EntiteGeneric{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @NotNull
    private String nomlot;

    @OneToMany(mappedBy = "lot")
    private Collection<Equipement> equipements;



    public String getNomlot() {
        return nomlot;
    }

    public void setNomlot(String nomlot) {
        this.nomlot = nomlot;
    }

    public Collection<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(Collection<Equipement> equipements) {
        this.equipements = equipements;
    }

    @Override
    public LotDTO convertToDTO() {
        LotDTO lot = new LotDTO();
        lot.setId(this.id);
        lot.setNomlot(this.nomlot);
        return lot;
    }
}
