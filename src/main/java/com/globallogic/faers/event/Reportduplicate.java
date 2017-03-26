package com.globallogic.faers.event;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPORTDUPLICATE")
public class Reportduplicate{

    private Long id;
    private String duplicatesource;
    private String duplicatenumb;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDuplicatesource() {
        return duplicatesource;
    }

    public void setDuplicatesource(String duplicatesource) {
        this.duplicatesource = duplicatesource;
    }

    public String getDuplicatenumb() {
        return duplicatenumb;
    }

    public void setDuplicatenumb(String duplicatenumb) {
        this.duplicatenumb = duplicatenumb;
    }

}
