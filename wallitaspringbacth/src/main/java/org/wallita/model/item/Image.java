package org.wallita.model.item;

import org.wallita.model.user.item.Urls;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Image{
    public String id;
    public String average_color;
    public Urls urls;
}
