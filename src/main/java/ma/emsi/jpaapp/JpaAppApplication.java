package ma.emsi.jpaapp;

import ma.emsi.jpaapp.entities.Patient;
import ma.emsi.jpaapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaAppApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 100; i++) {
            patientRepository.save(new Patient(null, "Med", new Date(), true, (int)(Math.random() * 100)));
        }
        Page<Patient> patients = patientRepository.findAll(PageRequest.of(0, 5));
        patients.forEach(
                patient -> {
                    System.out.println("==========================================");
                    System.out.println(patient.getId());
                    System.out.println(patient.getNom());
                    System.out.println(patient.getDateNaissance());
                    System.out.println(patient.isMalade());
                    System.out.println(patient.getScore());
                }
        );
        System.out.println("**************************************");
        Patient patient = patientRepository.findById(1L).orElse(null);
        if (patient != null) {
            System.out.println("==========================================");
            System.out.println(patient.getNom());
            System.out.println(patient.getDateNaissance());
            System.out.println(patient.isMalade());
            System.out.println(patient.getScore());
        }
        patient.setScore(156);
        patientRepository.save(patient);
        patientRepository.deleteById(1L);
    }
}
