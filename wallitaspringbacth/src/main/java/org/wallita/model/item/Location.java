package org.wallita.model.item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Location{
    public double latitude;
    public double longitude;
    public boolean approximated;
    public String country_code;
    public String city;
    public String postal_code;
}
