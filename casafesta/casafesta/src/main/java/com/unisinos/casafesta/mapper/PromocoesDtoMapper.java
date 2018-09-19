package com.unisinos.casafesta.mapper;

import com.unisinos.casafesta.dto.PromocaoDto;
import com.unisinos.casafesta.entity.Festa;
import com.unisinos.casafesta.entity.Promocao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PromocoesDtoMapper {

    public static List<PromocaoDto> toListPromocaoDto(List<Promocao> promocoes) {
        ArrayList<PromocaoDto> listPromocaoDto = new ArrayList<>();
        promocoes.forEach(promocao -> listPromocaoDto.add(toPromocaoDto(promocao)));
        return listPromocaoDto;
    }

    public static PromocaoDto toPromocaoDto(Promocao promocao) {
        PromocaoDto promocaoDto = new PromocaoDto();
        promocaoDto.setId(promocao.getId());
        promocaoDto.setDesconto(promocao.getDesconto());
        promocaoDto.setFinalVigencia(promocao.getFinalVigencia());
        promocaoDto.setInicioVigencia(promocao.getInicioVigencia());
        promocaoDto.setIdFestas(promocao.getFestas().stream().map(Festa::getId).collect(Collectors.toList()));
        return  promocaoDto;
    }

}
