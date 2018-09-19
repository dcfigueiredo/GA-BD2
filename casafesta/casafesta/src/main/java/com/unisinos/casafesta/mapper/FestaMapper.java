package com.unisinos.casafesta.mapper;

import com.unisinos.casafesta.converter.DateConverter;
import com.unisinos.casafesta.xml.Festa;

import java.util.stream.Collectors;

public class FestaMapper {

    public static Festa from(com.unisinos.casafesta.entity.Festa entity) {
        Festa festa = new Festa();

        festa.setId(entity.getId());
        festa.setData(DateConverter.from(entity.getData()));
        festa.setEstilo(entity.getEstilo());
        festa.setNome(entity.getNome());
        festa.getIngresso().addAll(entity.getIngressos().stream()
                .map(IngressoMapper::from)
                .collect(Collectors.toList()));
        festa.getPromocoes().addAll(entity.getPromocoes().stream()
                .map(PromocaoMapper::from)
                .collect(Collectors.toList()));

        return festa;
    }
}
