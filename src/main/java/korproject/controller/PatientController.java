package korproject.controller;

import korproject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController //HTTP 요청과 응답 처리 하는 클래스
public class PatientController {

    @Autowired private PatientService patientService;

    @PostMapping("/patient")
    public boolean save(@RequestBody Map<String,String>patientData){
        return patientService.save(patientData);
    }


}
