package org.study.service;

import org.study.model.Seller;
import org.study.repository.SellerRepository;

import java.util.List;

public class SellerService {

    public void add(String sellerName, long itemAmount, double salesValue){
        SellerRepository.add(sellerName, itemAmount, salesValue);
    }

    public List<Seller> getSellers(){
        return SellerRepository.getSellers();
    }

    public Seller getByName(String name) throws Exception {
        return SellerRepository.getByName(name);
    }

    public Boolean verifySeller(String name) {
        for (Seller seller: SellerRepository.getSellers()){
            if(seller.getSeller().equals(name)){
                return true;
            }
        }
        return false;
    }
}
