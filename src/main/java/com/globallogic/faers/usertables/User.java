package com.globallogic.faers.usertables;

import com.globallogic.faers.json.importer.Drug;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FAERS_USER")
public class User implements Serializable {

    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String login;

    @Column(columnDefinition = "character varying(32) NOT NULL")
    private String salt;

    @Column(columnDefinition = "character varying(64) NOT NULL")
    private String pass;

    private String mail;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "preferred_drug", joinColumns = @JoinColumn(name = "faers_user_id"), inverseJoinColumns = @JoinColumn(name = "drug_id"))
    private List<Drug> preferredDrug;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Drug> getPreferredDrug() {
        return preferredDrug;
    }

    public void setPreferredDrug(List<Drug> preferredDrug) {
        this.preferredDrug = preferredDrug;
    }
}
