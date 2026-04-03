package com.et.EnabledAfricaPlatform.repository.place;

import com.et.EnabledAfricaPlatform.models.places.LocalPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalPlaceRepository extends JpaRepository<LocalPlace, Long> {
}
