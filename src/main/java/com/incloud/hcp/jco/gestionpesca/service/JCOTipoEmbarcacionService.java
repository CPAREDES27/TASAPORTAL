package com.incloud.hcp.jco.gestionpesca.service;

import com.incloud.hcp.jco.gestionpesca.dto.TipoEmbarcacionDto;

import java.util.List;

public interface JCOTipoEmbarcacionService {
    List<TipoEmbarcacionDto> listaTipoEmbarcacion() throws Exception;
}
