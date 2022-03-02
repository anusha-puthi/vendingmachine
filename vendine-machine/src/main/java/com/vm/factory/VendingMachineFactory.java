package com.vm.factory;

import com.vm.service.VendingMachine;
import com.vm.service.VendingMachineImpl;

public class VendingMachineFactory {
    public static VendingMachine createVendingMachine() {
        return new VendingMachineImpl();
    }

}
