package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_id_gen")
    @SequenceGenerator(name = "department_id_gen", sequenceName = "department_id_seq", allocationSize = 1,initialValue = 10)
    private Long id;
    private String name;
    @ManyToMany
    private List<Doctor> doctors;

    @ManyToOne()
    private Hospital hospital;
}
