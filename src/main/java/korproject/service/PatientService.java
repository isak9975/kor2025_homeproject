package korproject.service;

import korproject.model.Mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PatientService {

    @Autowired private PatientMapper patientMapper;

    public boolean save(Map<String,String>patientData){
    return patientMapper.save(patientData);}
}
