package ru.home.model;

import lombok.Data;

@Data
public class ResponseId {

    private Long id;
    private Integer statusCode;

    public ResponseId(Long id, Integer statusCode){
        this.id = id;
        this.statusCode = statusCode;
    }

}
