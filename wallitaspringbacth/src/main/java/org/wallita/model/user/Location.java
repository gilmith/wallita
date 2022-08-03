package org.wallita.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Location{
    public double approximated_latitude;
    public double approximated_longitude;
    public String city;
    public String zip;
    public String country_code;
    public int approxRadius;
    public boolean approximated_location;
}