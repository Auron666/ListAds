package ru.home.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.home.model.Ads;
import ru.home.model.Response;
import ru.home.model.ResponseId;
import ru.home.service.AdsService;

import java.util.List;


@RestController
@Slf4j
public class AdsController {

    @Autowired
    private AdsService adsService;

    @PostMapping(value = "/getAllAds")
    public List<Ads> getAllAds(){
        return adsService.getAllAds();
    }

    @PostMapping(value = "/getAdsById")
    public Response getAdsById(@Validated @RequestBody Ads ads){
        return adsService.getAds(ads.getId());
    }

    @PostMapping(value = "/saveads")
    public ResponseId saveAds(@Validated @RequestBody Ads ads){
        return adsService.createAds(ads);
    }

}
