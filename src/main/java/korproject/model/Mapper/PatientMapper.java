package korproject.model.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface PatientMapper {

    //추상메소드란? 메소드의 { } 가 없는 메소드
    //반환타입 메소드명 (매개변수타입 매개변수명);
    @Insert("insert into patient(name,birthdate,phone,address)values(#{이름},#{생년월일},#{전화번호},#{주소})")
    boolean save(Map<String,String> patientData);
}
