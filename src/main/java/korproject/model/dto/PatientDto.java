package korproject.model.dto;

import korproject.model.entity.PatientEntity;
import lombok.*;

@Setter@Getter@Builder
@AllArgsConstructor@NoArgsConstructor
public class PatientDto {
    private int patientid;

    private String name;

    private String birthdate;

    private String phone;

    private String address;

    private String createdat;

    PatientEntity toEntity(){
        return PatientEntity.builder()
                .patientid(this.patientid)
                .name(this.name)
                .birthdate(this.birthdate)
                .phone(this.phone)
                .address(this.address).build();
    }
}
