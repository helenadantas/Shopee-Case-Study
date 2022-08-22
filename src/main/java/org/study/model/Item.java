package org.study.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@Data
public class Item {

    private Seller seller;
    private String customerName;
    private LocalDate dateOfSale;
    private String itemName;
    private double saleValue;

    public Long getSellerSalesAmount() {
        return this.seller.getItemAmount();
    }

    public Double getSellerValueSalesAmount() {
        return this.seller.getSalesValue();
    }

}
