package org.sid.equipement.dto;

import org.sid.equipement.dao.model.Contrat;

public class ContratDTO extends ENtiteGenericDTO{


    private int numcontrat;





    public int getNumcontrat() {
        return numcontrat;
    }

    public void setNumcontrat(int numcontrat) {
        this.numcontrat = numcontrat;
    }

    @Override
    public Contrat convertToEntity() {
        Contrat contrat = new Contrat();
        contrat.setId(this.id);
        contrat.setNumcontrat(this.numcontrat);
        return contrat;
    }
}
