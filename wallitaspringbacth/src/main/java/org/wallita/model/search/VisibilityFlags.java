package org.wallita.model.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisibilityFlags{
    public boolean bumped;
    public boolean highlighted;
    public boolean urgent;
    public boolean country_bumped;
    public boolean boosted;
}
