package com.smart.entity;

import lombok.Data;

/**
 * Created by zyy on 19/9/9.
 */

@Data
public class Book {

    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;

}
