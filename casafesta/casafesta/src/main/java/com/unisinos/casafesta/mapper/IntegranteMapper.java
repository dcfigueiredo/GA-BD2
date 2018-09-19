package com.unisinos.casafesta.mapper;

import com.unisinos.casafesta.converter.DateConverter;
import com.unisinos.casafesta.xml.Integrante;

public class IntegranteMapper {

    public static Integrante from(com.unisinos.casafesta.entity.Integrante entity) {
        if (entity == null) {
            return null;
        }

        Integrante integrante = new Integrante();

        integrante.setId(entity.getId());
        integrante.setDataNascimento(DateConverter.from(entity.getDataNascimento()));
        integrante.setNome(entity.getNome());
        integrante.setTelefone(entity.getTelefone());

        return integrante;
    }
}
