package org.wallita.model.item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Condition{
    public String value;
    public String title;
    public String text;
    public String icon_text;
}