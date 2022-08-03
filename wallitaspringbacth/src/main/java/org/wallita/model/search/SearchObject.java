package org.wallita.model.search;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchObject{
    public String id;
    public String title;
    public String description;
    public double distance;
    public ArrayList<Image> images;
    public User user;
    public Flags flags;
    public VisibilityFlags visibility_flags;
    public double price;
    public String currency;
    public boolean free_shipping;
    public String web_slug;
    public int category_id;
    public Shipping shipping;
    public boolean supports_shipping;
    public boolean shipping_allowed;
    public String seller_id;
    public boolean favorited;
    public Object modification_date;
    public Location location;
}