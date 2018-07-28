package com.jooq.h2.spring;


import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class BookData implements Serializable {

    @Column(name = "title")
    private String title;

    @Column(name = "author_id")
    private int authorId;

    @Column(name = "published_in")
    private int publishedIn;

}
