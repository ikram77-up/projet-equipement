package org.sid.equipement.dao.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.sid.equipement.dto.LocalDTO;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Local extends EntiteGeneric{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @NotNull
    private String nomLocal;

    @OneToMany(mappedBy = "local")
    private Collection<Equipement> equipements;



    public Collection<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(Collection<Equipement> equipements) {
        this.equipements = equipements;
    }



    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }



    @Override
    public LocalDTO convertToDTO() {
        LocalDTO local = new LocalDTO();
        local.setId(this.id);
        local.setNomLocal(this.nomLocal);

        return local;
    }
}
