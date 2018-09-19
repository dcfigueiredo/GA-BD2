package com.unisinos.casafesta.mapper;

import com.unisinos.casafesta.dto.IngressoDto;
import com.unisinos.casafesta.entity.Ingresso;

import java.util.ArrayList;
import java.util.List;

public class IngressoDtoMapper {

    public static List<IngressoDto> toListIngressoDto(ArrayList<Ingresso> ingressos) {
        ArrayList<IngressoDto> listIngressoDto = new ArrayList<>();
        ingressos.forEach(ingresso -> {
            listIngressoDto.add(toIngressoDto(ingresso));
        });
        return listIngressoDto;
    }

    public static IngressoDto toIngressoDto(Ingresso ingresso) {
        IngressoDto ingressoDto = new IngressoDto();
        ingressoDto.setId(ingresso.getId());
        ingressoDto.setCategoria(ingresso.getCategoria());
        ingressoDto.setPreco(ingresso.getPreco());
        ingressoDto.setIdFesta(ingresso.getFesta().getId());
        ingressoDto.setIdIntegrante(ingresso.getIntegrante().getId());
        return ingressoDto;
    }

}
