package org.wallita.model.user.item;

import java.util.ArrayList;

import org.wallita.model.search.Shipping;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Datnum {
	
    public String id;
    public String title;
    public String description;
    public String category_id;
    public String slug;
    public ArrayList<Image> images;
    public Price price;
    public TypeAttributes type_attributes;
    public Shipping shipping;
    public Reserved reserved;

}
