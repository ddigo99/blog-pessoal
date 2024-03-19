package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
