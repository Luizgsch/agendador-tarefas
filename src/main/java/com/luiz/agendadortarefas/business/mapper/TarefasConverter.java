package com.luiz.agendadortarefas.business.mapper;


import com.luiz.agendadortarefas.business.dto.TarefasDTO;
import com.luiz.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
