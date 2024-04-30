package ma.enset.activity_2_patient.repositories;

import ma.enset.activity_2_patient.entities.Consultation;
import ma.enset.activity_2_patient.entities.Medecin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {

}
