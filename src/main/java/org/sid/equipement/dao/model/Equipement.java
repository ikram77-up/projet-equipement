package org.sid.equipement.dao.model;


import com.sun.istack.NotNull;
import lombok.*;

import org.sid.equipement.dto.EquipementDTO;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name= "TypeEqui",length =  8)
public  class Equipement extends EntiteGeneric{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @NotNull
    private String codeequipInterne;
    @NotNull
    private String codeequipexterne;
    @NotNull
    private String libelle;
    @NotNull
    private String type;
    @NotNull
    private String marque;
    @NotNull
    private String rattachement;
    @NotNull
    private Boolean controleregelementaire;
    @NotNull
    private Boolean sousgarentie;
    @NotNull
    private Boolean souscontrat;
    @NotNull
    private double puissance;
    @NotNull
    private Date datemiseservice;
    @NotNull

    private Date datefingarentie;
    @NotNull
    private int dureevie;


//les relations mapping
    @OneToOne(mappedBy = "equipement")
    private Contrat contrat;






    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idlot" ,referencedColumnName = "id")
    private Lot lot;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idprestation" ,referencedColumnName = "id")
    private Prestation prestation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idlocal" ,referencedColumnName = "id")
    private Local local;




    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public String getCodeequipInterne() {
        return codeequipInterne;
    }

    public void setCodeequipInterne(String codeequipInterne) {
        this.codeequipInterne = codeequipInterne;
    }

    public String getCodeequipexterne() {
        return codeequipexterne;
    }

    public void setCodeequipexterne(String codeequipexterne) {
        this.codeequipexterne = codeequipexterne;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getRattachement() {
        return rattachement;
    }

    public void setRattachement(String rattachement) {
        this.rattachement = rattachement;
    }

    public Boolean getControleregelementaire() {
        return controleregelementaire;
    }

    public void setControleregelementaire(Boolean controleregelementaire) {
        this.controleregelementaire = controleregelementaire;
    }

    public Boolean getSousgarentie() {
        return sousgarentie;
    }

    public void setSousgarentie(Boolean sousgarentie) {
        this.sousgarentie = sousgarentie;
    }

    public Boolean getSouscontrat() {
        return souscontrat;
    }

    public void setSouscontrat(Boolean souscontrat) {
        this.souscontrat = souscontrat;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public Date getDatemiseservice() {
        return datemiseservice;
    }

    public void setDatemiseservice(Date datemiseservice) {
        this.datemiseservice = datemiseservice;
    }

    public Date getDatefingarentie() {
        return datefingarentie;
    }

    public void setDatefingarentie(Date datefingarentie) {
        this.datefingarentie = datefingarentie;
    }

    public int getDureevie() {
        return dureevie;
    }

    public void setDureevie(int dureevie) {
        this.dureevie = dureevie;
    }

    public Contrat getContrat() {
        return contrat;
    }




    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public Prestation getPrestation() {
        return prestation;
    }

    public void setPrestation(Prestation prestation) {
        this.prestation = prestation;
    }


    @Override
    public EquipementDTO convertToDTO() {
        EquipementDTO equipement = new EquipementDTO();
        equipement.setId(this.id);
        equipement.setLibelle(this.libelle);
        equipement.setMarque(this.marque);
        equipement.setPuissance(this.puissance);
        equipement.setRattachement(this.rattachement);
        equipement.setSouscontrat(this.souscontrat);
        equipement.setCodeequipexterne(this.codeequipexterne);
        equipement.setCodeequipInterne(this.codeequipInterne);
        equipement.setControleregelementaire(this.controleregelementaire);
        equipement.setDatefingarentie(this.datefingarentie);
        equipement.setDatemiseservice(this.datemiseservice);
        equipement.setDureevie(this.dureevie);
        equipement.setType(this.type);
        equipement.setSousgarentie(this.sousgarentie);
        return equipement;
    }
}
