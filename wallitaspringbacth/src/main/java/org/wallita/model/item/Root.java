package org.wallita.model.item;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Root{
    public String id;
    public Title title;
    public Description description;
    public ArrayList<Taxonomy> taxonomy;
    public String type;
    public User user;
    public String slug;
    public String share_url;
    public int modified_date;
    public ArrayList<Image> images;
    public Price price;
    public Location location;
    public TypeAttributes type_attributes;
    public Reserved reserved;
    public SupportsShipping supports_shipping;
    public Shipping shipping;
    public Hashtags hashtags;
    public Favorited favorited;
    public Counters counters;
}
