package org.sid.equipement.dao.Repositories;

import org.sid.equipement.dao.model.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotRepository extends JpaRepository<Lot,Long> {
}
