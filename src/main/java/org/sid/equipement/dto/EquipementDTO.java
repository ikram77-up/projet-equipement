package org.sid.equipement.dto;

import org.sid.equipement.dao.model.Equipement;

import java.util.Date;

public class EquipementDTO extends ENtiteGenericDTO{

    private String codeequipInterne;
    private String codeequipexterne;
    private String libelle;
    private String type;
    private String marque;
    private String rattachement;
    private Boolean controleregelementaire;
    private Boolean sousgarentie;
    private Boolean souscontrat;
    private double puissance;
    private Date datemiseservice;
    private Date datefingarentie;
    private int dureevie;
    private ContratDTO contratDTO;
    private LotDTO lotDTO;
    private LocalDTO localDTO;
    private PrestationDTO prestationDTO;


    public ContratDTO getContratDTO() {
        return contratDTO;
    }

    public void setContratDTO(ContratDTO contratDTO) {
        this.contratDTO = contratDTO;
    }

    public LotDTO getLotDTO() {
        return lotDTO;
    }

    public void setLotDTO(LotDTO lotDTO) {
        this.lotDTO = lotDTO;
    }

    public LocalDTO getLocalDTO() {
        return localDTO;
    }

    public void setLocalDTO(LocalDTO localDTO) {
        this.localDTO = localDTO;
    }

    public PrestationDTO getPrestationDTO() {
        return prestationDTO;
    }

    public void setPrestationDTO(PrestationDTO prestationDTO) {
        this.prestationDTO = prestationDTO;
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

    @Override
    public Equipement convertToEntity() {
        Equipement equipement = new Equipement() ;
        equipement.setId(this.id);
        equipement.setCodeequipInterne(this.codeequipInterne);
        equipement.setCodeequipexterne(this.codeequipexterne);
        equipement.setLibelle(this.libelle);
        equipement.setMarque(this.marque);
        equipement.setPuissance(this.puissance);
        equipement.setType(this.type);
        equipement.setRattachement(this.rattachement);
        equipement.setSouscontrat(this.souscontrat);
        equipement.setSousgarentie(this.sousgarentie);
        equipement.setControleregelementaire(this.controleregelementaire);
        equipement.setDatefingarentie(this.datefingarentie);
        equipement.setDatemiseservice(this.datemiseservice);
        equipement.setDureevie(this.dureevie);


        return equipement;
    }
}
