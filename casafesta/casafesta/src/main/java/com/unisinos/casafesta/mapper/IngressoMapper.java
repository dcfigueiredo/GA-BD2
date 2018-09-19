package com.unisinos.casafesta.mapper;

import com.unisinos.casafesta.xml.Ingresso;

public class IngressoMapper {

    public static Ingresso from(com.unisinos.casafesta.entity.Ingresso entity) {
        Ingresso ingresso = new Ingresso();

        ingresso.setId(entity.getId());
        ingresso.setCategoria(entity.getCategoria());
        ingresso.setIntegrante(IntegranteMapper.from(entity.getIntegrante()));
        ingresso.setPreco(entity.getPreco());

        return ingresso;
    }
}
