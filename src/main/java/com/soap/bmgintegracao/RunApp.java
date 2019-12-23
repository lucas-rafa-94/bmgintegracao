package com.soap.bmgintegracao;

import com.soap.bmgintegracao.model.BuscarLimiteSaqueModel;
import com.soap.bmgintegracao.model.CpfBaseBmgModel;
import com.soap.bmgintegracao.repository.BuscarLimiteSaqueRepository;
import com.soap.bmgintegracao.repository.CpfBaseBmgRepository;
import com.soap.bmgintegracao.service.BmgCaller;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class RunApp implements CommandLineRunner {

    @Autowired
    BuscarLimiteSaqueRepository buscarLimiteSaqueRepository;

    @Autowired
    CpfBaseBmgRepository cpfBaseBmgRepository;

    @Autowired
    BmgCaller bmgCaller;
    public void run(String... args) {
        List<CpfBaseBmgModel> list = new ArrayList<>();

        CpfBaseBmgModel cpfBaseBmgModel1 = new CpfBaseBmgModel();
        cpfBaseBmgModel1.setNumeroDocumento("38876506896");
        CpfBaseBmgModel cpfBaseBmgModel2 = new CpfBaseBmgModel();
        cpfBaseBmgModel2.setNumeroDocumento("38876506897");

        list.add(cpfBaseBmgModel1);
        list.add(cpfBaseBmgModel2);

        cpfBaseBmgRepository.saveAll(list);
    }
}
