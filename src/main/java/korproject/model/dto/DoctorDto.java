package korproject.model.dto;

import lombok.*;

@Setter@Getter@Builder
@AllArgsConstructor@NoArgsConstructor
public class DoctorDto {
    private int doctorid;

    private String name;

    private String specialty;

    private String phone;

    private String createdat;
}
