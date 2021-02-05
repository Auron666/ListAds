package ru.home.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.home.model.Ads;
import ru.home.repository.AdsRepository;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class AdsServiceImplTest {

    @Autowired
    private AdsRepository repository;

//    @Test
//    void getAllAds() {
//    }
//
//    @Test
//    void getAds() {
//    }

    @Test
    void createAds() {

        //Ads ads = new Ads(Long.valueOf("12"), "Продажа PS 4", "Продаю PS 4 1 TB", "https://www.sony.com", "https://www.sony.com", 35000);
//
//        repository.save(ads);



        Assert.assertNotNull(new Ads());

    }
}