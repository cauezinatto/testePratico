package provaPratica.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import provaPratica.entity.Automovel;
import provaPratica.entity.dto.AutomovelDTO;
import provaPratica.service.AutomovelService;

import java.util.List;

@RestController
@RequestMapping
public class AutomovelController {
    private AutomovelService automovelService;

    @PostMapping("/cadastroAutomoveis")
    public ResponseEntity<Automovel> cadastrarAutomovel(@RequestBody AutomovelDTO automovelDTO){

        Automovel automovel = automovelService.cadastrarAutomovel(automovelDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(automovel);
    }

    @GetMapping("/automoveis")
    public ResponseEntity<List<Automovel>> ListAll(){
        List<Automovel> listaAutomovel = automovelService.ListAll();

        return ResponseEntity.ok().body(listaAutomovel);
    }
}
