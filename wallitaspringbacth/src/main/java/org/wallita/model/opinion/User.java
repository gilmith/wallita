package org.wallita.model.opinion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User{
    public String id;
    public String micro_name;
    public Image image;
    public String web_slug;
}
