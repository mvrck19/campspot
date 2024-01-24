package com.campspot.campspot;


import org.springframework.data.repository.CrudRepository;


public interface CampingSpotRepository extends CrudRepository<CampingSpot,Long> {
    
    CampingSpot findByname(String name);

    CampingSpot findById(long id);

}
