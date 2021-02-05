package ru.home.model;

import lombok.Data;

@Data
public class Response {

    private String name;
    private Integer price;
    private String mainurl;


    public Response(String name, Integer price, String mainurl){
        this.name = name;
        this.price = price;
        this.mainurl = mainurl;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getMainurl() {
        return mainurl;
    }

}
