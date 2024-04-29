package testeItau.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testeItau.entity.Automovel;
import testeItau.entity.dto.AutomovelDTO;
import testeItau.service.AutomovelService;

import java.util.List;

@RestController
@RequestMapping
public class AutomovelController {

    private AutomovelService automovelService;

    @PostMapping("/cadastroAutomoveis")
    public ResponseEntity<Automovel> cadastrarAutomovel(@RequestBody AutomovelDTO automovelDTO){

        Automovel automovel = AutomovelService.cadastrarAutomovel(automovelDTO);
        return ResponseEntity.ok().body(automovel);
    }

    @GetMapping("/automóveis")
    public ResponseEntity<List<Automovel>> ListAll(){
        List<Automovel> listaAutomovel = automovelService.ListAll();

        return ResponseEntity.ok().body(listaAutomovel);
    }
}
