package org.study.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
public class Seller {


    private String seller;

    private Long itemAmount;

    private Double salesValue;
}
