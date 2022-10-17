package com.arturces.workshopspringbootmongodb.dto;

import java.util.Date;

public class CommentDTO {

    private String text;
    private Date data;
    private AuthorDTO author;

    public CommentDTO(String text, Date data, AuthorDTO author) {
        this.text = text;
        this.data = data;
        this.author = author;
    }

    public CommentDTO(){

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
