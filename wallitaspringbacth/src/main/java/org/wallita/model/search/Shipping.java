package org.wallita.model.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Shipping{
    public boolean item_is_shippable;
    public boolean user_allows_shipping;
}
