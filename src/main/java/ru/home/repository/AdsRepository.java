package ru.home.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.home.model.Ads;

import java.util.List;

@Repository
public interface AdsRepository extends CrudRepository<Ads, Long> {

    List<Ads> findAll();

}
