package pl.somehost.crypt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.somehost.crypt.domain.StoredPasswdFile;

@Repository
public interface StoredPasswdFileRepository extends CrudRepository<StoredPasswdFile,Integer> {

    StoredPasswdFile findById(int id);

}
