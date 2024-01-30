package com.udla.springboot.backend.apirest.services;

import java.util.List;
import com.udla.springboot.backend.apirest.dto.ClienteDistanciaDTO;


public interface IKNNService {
    List<ClienteDistanciaDTO> encontrarVecinosCercanos(Long clienteId, int k);
}
