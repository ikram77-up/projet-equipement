package org.sid.equipement.dao.Repositories;

import org.sid.equipement.dao.model.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
