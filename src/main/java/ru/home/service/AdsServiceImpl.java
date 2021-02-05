package ru.home.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.model.Ads;
import ru.home.model.Response;
import ru.home.model.ResponseId;
import ru.home.repository.AdsRepository;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class AdsServiceImpl implements AdsService {

    @Autowired
    private AdsRepository adsRepository;


    @Override
    public List<Ads> getAllAds() {
       List<Ads> listAds =  adsRepository.findAll();
       List<Ads> listAdsResp = new ArrayList<>();

       listAds.forEach(e -> listAdsResp.add(e));

       return listAdsResp;
    }

    @Override
    public Response getAds(Long id) {
           Ads adsResp =  adsRepository.findById(id).orElse(null);
           return new Response(adsResp.getName(), adsResp.getPrice(), adsResp.getMainurl());
    }

    @Override
    public ResponseId createAds(Ads ads) {
        if(ads == null){
            return new ResponseId(Long.valueOf("0"), 500);
        }else{
          Ads adsResp =  adsRepository.save(ads);
          return new ResponseId(adsResp.getId(), 200);
        }

    }
}
