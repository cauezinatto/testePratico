package testeItau.entity.dto;

import org.yaml.snakeyaml.events.Event;
import lombok.Data;
public record AutomovelDTO(
        Long Id,
        String modelo,
        String marca,
        Long valor,
        Data dateTime) {
}
