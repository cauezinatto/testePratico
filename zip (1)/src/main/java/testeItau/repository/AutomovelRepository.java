package testeItau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testeItau.entity.Automovel;

public interface AutomovelRepository extends JpaRepository<Automovel, Long> {

}
