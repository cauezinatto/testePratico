package provaPratica.entity.dto;

import lombok.Data;
public record AutomovelDTO(
        Long Id,
        String modelo,
        String marca,
        Long valor,
        Data dateTime) {
}
