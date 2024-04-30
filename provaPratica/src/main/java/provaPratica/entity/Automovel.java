package provaPratica.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

public class Automovel {

    @Autowired
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