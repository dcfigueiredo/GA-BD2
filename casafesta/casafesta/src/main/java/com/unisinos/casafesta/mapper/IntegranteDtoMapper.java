package com.unisinos.casafesta.mapper;

import com.unisinos.casafesta.dto.IntegranteDto;
import com.unisinos.casafesta.entity.Ingresso;
import com.unisinos.casafesta.entity.Integrante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegranteDtoMapper {

    public static List<IntegranteDto> toListIntegranteDto(List<Integrante> integrantes) {
        ArrayList<IntegranteDto> listIntegranteDto = new ArrayList<>();
        integrantes.forEach(integrante -> listIntegranteDto.add(toIntegranteDto(integrante)));
        return listIntegranteDto;
    }

    public static IntegranteDto toIntegranteDto(Integrante integrante) {
        IntegranteDto integranteDto = new IntegranteDto();
        integranteDto.setId(integrante.getId());
        integranteDto.setDataNascimento(integrante.getDataNascimento());
        integranteDto.setNome(integrante.getNome());
        integranteDto.setTelefone(integrante.getTelefone());
        integranteDto.setIdIngressos(integrante.getIngressos().stream().map(Ingresso::getId).collect(Collectors.toList()));
        return integranteDto;
    }
}
