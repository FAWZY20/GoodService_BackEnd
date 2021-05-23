package com.example.goodservice.controller;

import com.example.goodservice.service.ProfessionalService;
import com.example.goodservice.model.ProfesionalRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessionalRegisterController {

    @Autowired
    private ProfessionalService service;

    @PostMapping("/registerProfessional")
    public ProfesionalRegister registerProfessional(@RequestBody ProfesionalRegister professional) throws Exception
    {
        String tempEmail = professional.getEmail();
        if(tempEmail != null && !"".equals(tempEmail))
        {
            ProfesionalRegister userobj = (ProfesionalRegister) service.fetchProfessionalByEmail(tempEmail);
            if(userobj != null) {
                throw  new Exception("utilisateur avec"+tempEmail+"existe déjà");
            }
        }
        ProfesionalRegister userObj = null;
        userObj = (ProfesionalRegister) service.saveProfessional(professional);
        return (ProfesionalRegister) userObj;
    }

    @PostMapping("/connexionProfessional")
    public ProfesionalRegister loginProfessional(@RequestBody ProfesionalRegister profesionalRegister) throws Exception
    {
        String tempEmail = profesionalRegister.getEmail();
        String tempPass = profesionalRegister.getMdp();
        ProfesionalRegister userObj = null;
        if(tempEmail != null && tempPass != null) {
            userObj = (ProfesionalRegister) service.fetchProfessionalByEmailAndMdp(tempEmail, tempPass);
        }
        if(userObj == null ) {
            throw new Exception("Mauvaises qualifications");
        }
        return (ProfesionalRegister) userObj;
    }
}
