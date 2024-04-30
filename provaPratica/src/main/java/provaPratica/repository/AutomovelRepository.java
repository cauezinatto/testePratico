package provaPratica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import provaPratica.entity.Automovel;

public interface AutomovelRepository extends JpaRepository<Automovel, Long> {
}
