package com.example.goodservice.controller;

import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessionalController {

    @Autowired
    private ProfessionalService service;

    @PostMapping("/registerProfessional")
    public ProfesionalEntity registerProfessional(@RequestBody ProfesionalEntity professional) throws Exception
    {
        String tempEmail = professional.getEmail();
        if(tempEmail != null && !"".equals(tempEmail))
        {
            ProfesionalEntity userobj = (ProfesionalEntity) service.fetchProfessionalByEmail(tempEmail);
            if(userobj != null) {
                throw  new Exception("utilisateur avec"+tempEmail+"existe déjà");
            }
        }
        ProfesionalEntity userObj = null;
        userObj = (ProfesionalEntity) service.saveProfessional(professional);
        return (ProfesionalEntity) userObj;
    }

    @PostMapping("/connexionProfessional")
    public ProfesionalEntity loginProfessional(@RequestBody ProfesionalEntity profesionalEntity) throws Exception
    {
        String tempEmail = profesionalEntity.getEmail();
        String tempPass = profesionalEntity.getMdp();
        ProfesionalEntity userObj = null;
        if(tempEmail != null && tempPass != null) {
            userObj = (ProfesionalEntity) service.fetchProfessionalByEmailAndMdp(tempEmail, tempPass);
        }
        if(userObj == null ) {
            throw new Exception("Mauvaises qualifications");
        }
        return (ProfesionalEntity) userObj;
    }
}
