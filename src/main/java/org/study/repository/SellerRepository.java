package org.study.repository;

import lombok.Getter;
import org.study.model.Seller;

import java.util.ArrayList;
import java.util.List;
@Getter
public class SellerRepository {

    private static List<Seller> sellers = new ArrayList<>();

    public static Seller getByName(String name) throws Exception {
        for (Seller seller: sellers){
            if(seller.getSeller().equals(name)){
                return seller;
            }
        }
        throw new Exception("Seller not found");
    }

    public static void add(String sellerName, long itemAmount, double salesValue){
        Seller seller = new Seller(sellerName, itemAmount, salesValue);
        sellers.add(seller);
    }

    public static List<Seller> getSellers() {
        return sellers;
    }

    public static void setSellers(List<Seller> sellers) {
        SellerRepository.sellers = sellers;
    }
}
