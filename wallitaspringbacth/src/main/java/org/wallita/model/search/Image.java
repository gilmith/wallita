package org.wallita.model.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Image{
    public String original;
    public String xsmall;
    public String small;
    public String large;
    public String medium;
    public String xlarge;
    public int original_width;
    public int original_height;
}
