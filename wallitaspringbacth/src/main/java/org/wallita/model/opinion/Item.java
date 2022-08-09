package org.wallita.model.opinion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder	
public class Item{
    public String id;
    public String title;
    public int category_id;
    public Image image;
    public String web_link;
}
