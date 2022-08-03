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
public class Root{
    public ArrayList<SearchObject> search_objects;
    public int from; 
    public int to;
    public boolean distance_ordered;
    public String keywords;
    public String order;
    public String bubble;
    public SearchPoint search_point;
}