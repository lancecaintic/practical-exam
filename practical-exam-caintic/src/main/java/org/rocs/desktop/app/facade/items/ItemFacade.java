package org.rocs.desktop.app.facade.items;

public interface ItemFacade {
    Item getItem(String itemId);

    Customer getCustomer(String name);

    void checkout(List<Transaction> transactions);
}
