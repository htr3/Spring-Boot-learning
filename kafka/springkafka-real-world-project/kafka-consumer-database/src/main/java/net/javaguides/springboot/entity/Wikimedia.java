package net.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wikimedia_recentchange")
@Getter
@Setter
public class Wikimedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Lob
    private String wikidata;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWikidata() {
        return wikidata;
    }

    public void setWikidata(String wikidata) {
        this.wikidata = wikidata;
    }
}
