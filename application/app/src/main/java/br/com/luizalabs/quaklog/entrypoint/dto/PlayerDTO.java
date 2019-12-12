package br.com.luizalabs.quaklog.entrypoint.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class PlayerDTO {
    private Integer id;
    private String name;
    private List<String> items;
    private Integer kills;
    private Map<String, String> parameters;
    @JsonProperty("kd_history")
    private List<KillHistoryDTO> kdHistory;
    private List<PlayerStatusDTO> status;
}
