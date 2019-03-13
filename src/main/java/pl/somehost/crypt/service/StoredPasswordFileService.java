package pl.somehost.crypt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.somehost.crypt.domain.Crypt;
import pl.somehost.crypt.domain.StoredPasswdFile;
import pl.somehost.crypt.repository.StoredPasswdFileRepository;

@Service
public class StoredPasswordFileService {

    @Autowired
    private StoredPasswdFileRepository storedPasswdFileRepository;


    public StoredPasswdFile save(StoredPasswdFile storedPasswdFile){
        return storedPasswdFileRepository.save(storedPasswdFile);
    }


    public StoredPasswdFile getstoredPasswordFile(int id) {
        return storedPasswdFileRepository.findById(id);
    }

    public StoredPasswdFile update(StoredPasswdFile storedPasswdFile) {
        return storedPasswdFileRepository.save(storedPasswdFile);
    }
}
