package pl.somehost.crypt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.somehost.crypt.domain.StoredPasswdFile;
import pl.somehost.crypt.service.StoredPasswordFileService;

@CrossOrigin(origins = "*")
@RestController
//@RequestMapping(value ="/")
public class StoredPasswordFileController {

    @Autowired
    private StoredPasswordFileService storedPasswordFileService;

    public static final Logger LOGGER = LoggerFactory.getLogger(StoredPasswdFile.class);

    @PutMapping("/crypt")
    StoredPasswdFile saveStoredPasswdFile(@RequestBody StoredPasswdFile storedPasswdFile){
        LOGGER.info("PUT FROM CRYPT" + storedPasswdFile.show());
        return storedPasswordFileService.update(storedPasswdFile);
    }

    @GetMapping("/crypt/{id}")
    StoredPasswdFile getStoredPasswordFile(@PathVariable Integer id){
        return storedPasswordFileService.getstoredPasswordFile(id);
    }

}
