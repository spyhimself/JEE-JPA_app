package ma.emsi.jpaapp.repository;

import ma.emsi.jpaapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
