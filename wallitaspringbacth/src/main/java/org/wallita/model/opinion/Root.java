package org.wallita.model.opinion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Root{
    public Item item;
    public Review review;
    public User user;
    public String type;
}