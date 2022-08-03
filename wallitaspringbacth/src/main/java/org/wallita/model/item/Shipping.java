package org.wallita.model.item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Shipping{
    public boolean item_is_shippable;
    public boolean user_allows_shipping;
}
