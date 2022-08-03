package org.wallita.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UrlsBySize{
    public String small;
    public String xmall;
    public String original;
    public String large;
    public String xlarge;
    public String medium;
}