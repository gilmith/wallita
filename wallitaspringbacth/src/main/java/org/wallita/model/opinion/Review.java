package org.wallita.model.opinion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Review{
    public String id;
    public Object date;
    public int scoring;
    public String comments;
    public boolean is_shipping_transaction;
    public boolean can_translate;
}
