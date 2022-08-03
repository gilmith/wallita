package org.wallita.model.item;

import org.wallita.model.user.item.UpToKg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TypeAttributes{
    public Condition condition;
    public UpToKg up_to_kg;
}
