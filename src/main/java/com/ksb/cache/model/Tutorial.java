package com.ksb.cache.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "tutorials")
public class Tutorial implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private String published;

    @Override
    public String toString(){
        return "Tutorial [id" + id + ", title=" + ", desc=" + description + ", published=" + published + "]";
    }

}
