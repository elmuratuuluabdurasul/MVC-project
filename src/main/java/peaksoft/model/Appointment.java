package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_id_gen")
    @SequenceGenerator(name = "appointment_id_gen", sequenceName = "appointment_id_seq", allocationSize = 1,initialValue = 10)
    private Long id;
    private LocalDate date;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Department department;
    @ManyToOne
    private Hospital hospital;
}
