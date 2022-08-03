package org.wallita.model.user;

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
    public int original_width;
    public int original_height;
    public String average_hex_color;
    public UrlsBySize urls_by_size;
}
