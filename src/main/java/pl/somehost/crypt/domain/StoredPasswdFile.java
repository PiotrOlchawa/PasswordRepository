package pl.somehost.crypt.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "StoredPasswdFile")
public class StoredPasswdFile {

    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "fileText")
    @Type(type="text")
    private String fileText;

    public StoredPasswdFile() {
    }

    public StoredPasswdFile(String fileText) {
        this.fileText = fileText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileText() {
        return fileText;
    }

    public void setFileText(String fileText) {
        this.fileText = fileText;
    }

    public String show() {
        return "StoredPasswdFile{" +
                "id=" + id +
                ", fileText='" + fileText + '\'' +
                '}';
    }

}
