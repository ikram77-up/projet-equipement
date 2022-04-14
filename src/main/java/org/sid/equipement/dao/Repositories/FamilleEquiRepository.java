package org.sid.equipement.dao.Repositories;

import org.sid.equipement.dao.model.FamilleEquipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilleEquiRepository extends JpaRepository<FamilleEquipement,Long> {
}
