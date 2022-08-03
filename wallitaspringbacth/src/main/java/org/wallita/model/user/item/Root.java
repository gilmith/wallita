package org.wallita.model.user.item;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Root{
    public ArrayList<Datnum> data;
    public Meta meta;
}
