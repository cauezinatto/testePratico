package testeItau.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Automovel {

    @jakarta.persistence.Id
    public Long Id;
    public String modelo;
    public String marca;
    public Long valor;
    public Data dateTime;

    public Automovel(String modelo, String marca, Long valor, Data dateTime) {
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
    }

    public Automovel()
    {

    }

}
