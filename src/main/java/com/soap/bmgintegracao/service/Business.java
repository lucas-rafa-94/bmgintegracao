package com.soap.bmgintegracao.service;

import com.soap.bmgintegracao.model.CpfBaseBmgModel;
import com.soap.bmgintegracao.repository.BuscarLimiteSaqueRepository;
import com.soap.bmgintegracao.repository.CpfBaseBmgRepository;
import com.soap.bmgintegracao.repository.ObtemProdutosDeSeguroRepository;
import com.soap.bmgintegracao.repository.ValidaSeJaPossuiContaCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class Business {
    @Autowired
    CpfBaseBmgRepository cpfBaseBmgRepository;

    @Autowired
    ObtemProdutosDeSeguroRepository obtemProdutosDeSeguroRepository;

    @Autowired
    BuscarLimiteSaqueRepository buscarLimiteSaqueRepository;

    @Autowired
    ValidaSeJaPossuiContaCartaoRepository validaSeJaPossuiContaCartaoRepository;

    @Autowired
    Transformer transformer;

    @Autowired
    BmgCaller bmgCaller;

    public void bmgOrchestration(){
        Iterator cpfBaseIterator = cpfBaseBmgRepository.findAll().iterator();

        while (cpfBaseIterator.hasNext()) {
            CpfBaseBmgModel cpfBaseBmgModel = (CpfBaseBmgModel)  cpfBaseIterator.next();
            obtemProdutosDeSeguroRepository.saveAll(transformer.obtemProdutosDeSeguroRetorno2Model(bmgCaller.obtemProdutosDeSeguroRetorno(cpfBaseBmgModel),cpfBaseBmgModel.getNumeroDocumento()));
            buscarLimiteSaqueRepository.save(transformer.buscarLimiteSaqueRetorno2Model(bmgCaller.buscarLimiteSaque(cpfBaseBmgModel),cpfBaseBmgModel.getNumeroDocumento()));
            validaSeJaPossuiContaCartaoRepository.save(transformer.validaSeJaPossuiContaCartaoRetorno2Model(bmgCaller.validaSeJaPossuiContaCartao(cpfBaseBmgModel),cpfBaseBmgModel.getNumeroDocumento()));
        }
    }
}
