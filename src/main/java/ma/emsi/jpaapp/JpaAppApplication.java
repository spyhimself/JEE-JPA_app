package ma.emsi.jpaapp;

import ma.emsi.jpaapp.entities.Patient;
import ma.emsi.jpaapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaAppApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Ayman", new Date(), false, 56));
        patientRepository.save(new Patient(null, "Med", new Date(), true, 82));
        patientRepository.save(new Patient(null, "Amina", new Date(), false, 24));
    }
}
