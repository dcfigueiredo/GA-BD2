package com.unisinos.casafesta.mapper;

import com.unisinos.casafesta.converter.DateConverter;
import com.unisinos.casafesta.xml.Promocao;

public class PromocaoMapper {

    public static Promocao from(com.unisinos.casafesta.entity.Promocao entity) {
        Promocao promocao = new Promocao();

        promocao.setId(entity.getId());
        promocao.setDataFinalVigencia(DateConverter.from(entity.getFinalVigencia()));
        promocao.setDataInicioVigencia(DateConverter.from(entity.getInicioVigencia()));
        promocao.setPorcentagemDesconto(entity.getDesconto());

        return promocao;
    }
}
