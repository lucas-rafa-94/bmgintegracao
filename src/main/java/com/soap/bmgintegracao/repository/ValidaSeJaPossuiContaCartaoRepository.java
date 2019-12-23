package com.soap.bmgintegracao.repository;

import com.soap.bmgintegracao.model.ObtemProdutosDeSeguroModel;
import com.soap.bmgintegracao.model.ValidaSeJaPossuiContaCartaoModel;
import org.springframework.data.repository.CrudRepository;

public interface ValidaSeJaPossuiContaCartaoRepository extends CrudRepository<ValidaSeJaPossuiContaCartaoModel, String> {
}
