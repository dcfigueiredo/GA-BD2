package com.unisinos.casafesta.mapper;

import com.unisinos.casafesta.dto.FestaDto;
import com.unisinos.casafesta.entity.Festa;
import com.unisinos.casafesta.entity.Ingresso;
import com.unisinos.casafesta.entity.Promocao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FestaDtoMapper {

    public static FestaDto toFestaDto(Festa festa) {
        FestaDto festaDto = new FestaDto();
        festaDto.setId(festa.getId());
        festaDto.setData(festa.getData());
        festaDto.setEstilo(festa.getEstilo());
        festaDto.setNome(festa.getNome());
        festaDto.setIdIngressos(festa.getIngressos().stream().map(Ingresso::getId).collect(Collectors.toList()));
        festaDto.setIdPromocoes(festa.getPromocoes().stream().map(Promocao::getId).collect(Collectors.toList()));
        return festaDto;
    }

    public static List<FestaDto> toListFestaDto(List<Festa> festas) {
        ArrayList<FestaDto> festasDto = new ArrayList<>();
        festas.forEach(festa -> festasDto.add(toFestaDto(festa)));
        return festasDto;
    }
}
