package ru.home.model;


import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "mainurl")
    private String mainurl;

    @Column(name = "optionalurl")
    private String optionalurl;

    @Column(name = "price")
    private Integer price;

    public Ads(){
        super();
    }

    public Ads(Long id, String name, String description, String mainurl, String optionalurl, Integer price){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.mainurl = mainurl;
        this.optionalurl = optionalurl;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public String getMainurl() {
        return mainurl;
    }

    public String getOptionalurl() {
        return optionalurl;
    }
}
