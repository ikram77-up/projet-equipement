package org.sid.equipement.dao.model;

import org.sid.equipement.dto.ENtiteGenericDTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class EntiteGeneric {



    public abstract <T extends ENtiteGenericDTO>T convertToDTO();
}
