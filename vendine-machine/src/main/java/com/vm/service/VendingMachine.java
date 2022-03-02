package com.vm.service;

import com.vm.model.Bucket;
import com.vm.model.Coin;
import com.vm.model.Item;

import java.util.List;

public interface VendingMachine {
    public long selectItemAndGetPrice(Item item);
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Bucket<Item, List<Coin>> collectItemAndChange();
    public void reset();

}
