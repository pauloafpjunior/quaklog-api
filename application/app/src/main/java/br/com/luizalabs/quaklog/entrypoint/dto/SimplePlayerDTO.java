package br.com.luizalabs.quaklog.entrypoint.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimplePlayerDTO {
    private Integer id;
    private String name;
    private Integer kills;
}
