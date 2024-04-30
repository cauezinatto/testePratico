package provaPratica.service;

import org.springframework.beans.factory.annotation.Autowired;
import provaPratica.entity.Automovel;
import provaPratica.entity.dto.AutomovelDTO;
import provaPratica.repository.AutomovelRepository;

import java.util.List;

public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;


    public Automovel cadastrarAutomovel(AutomovelDTO AutomovelDTO) {
        Automovel automovel = new Automovel();

        automovel.modelo = AutomovelDTO.modelo();
        automovel.marca = AutomovelDTO.marca();
        automovel.valor = AutomovelDTO.valor();
        automovel.dateTime = AutomovelDTO.dateTime();

        return automovelRepository.save(automovel);
    }

    public List<Automovel> ListAll(){

        return automovelRepository.findAll();
    }
}
