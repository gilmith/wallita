package org.wallita.model.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User{
    public String id;
    public String micro_name;
    public Image image;
    public boolean online;
    public String kind;
}
