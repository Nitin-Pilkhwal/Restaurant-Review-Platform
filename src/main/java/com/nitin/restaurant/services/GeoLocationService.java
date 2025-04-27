package com.nitin.restaurant.services;

import com.nitin.restaurant.domain.GeoLocation;
import com.nitin.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}
