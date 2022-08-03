package org.wallita.model.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Flags{
    public boolean pending;
    public boolean sold;
    public boolean reserved;
    public boolean banned;
    public boolean expired;
    public boolean onhold;
}