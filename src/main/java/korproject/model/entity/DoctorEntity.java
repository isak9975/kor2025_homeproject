package korproject.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.PrimaryKey;

@Getter@Setter@Builder
@AllArgsConstructor@NoArgsConstructor
@Entity(name="doctor")
public class DoctorEntity extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorid;

    @Column(columnDefinition = "varchar(50)",nullable = false)
    private String name;

    @Column(columnDefinition = "varchar(50)",nullable = false)
    private String specialty;

    @Column(columnDefinition = "varchar(20)",nullable = false)
    private String phone;


}
