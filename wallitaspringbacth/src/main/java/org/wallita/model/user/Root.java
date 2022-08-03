package org.wallita.model.user;

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
    public String micro_name;
    public String type;
    public Image image;
    public Location location;
    public String gender;
    public String web_slug;
    public String url_share;
    public long register_date;
    public boolean featured;
}