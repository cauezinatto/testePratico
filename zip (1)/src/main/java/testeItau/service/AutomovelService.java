package testeItau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testeItau.entity.Automovel;
import testeItau.entity.dto.AutomovelDTO;
import testeItau.repository.AutomovelRepository;

import java.util.List;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;


    public static Automovel cadastrarAutomovel(AutomovelDTO AutomovelDTO) {
        Automovel automovel = new Automovel();

        automovel.modelo = automovel.modelo;
        automovel.marca = automovel.marca;
        automovel.valor = automovel.valor;
        automovel.dateTime = automovel.dateTime;

        return automovel;
    }

    public List<Automovel> ListAll(){

        return AutomovelService.findAll();
    }

    private static List<Automovel> findAll() {

        return null;
    }
}
