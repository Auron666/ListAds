package ru.home.service;

import ru.home.model.Ads;
import ru.home.model.Response;
import ru.home.model.ResponseId;

import java.util.List;

public interface AdsService {

    List<Ads> getAllAds();
    Response getAds(Long id);
    ResponseId createAds(Ads ads);

}
