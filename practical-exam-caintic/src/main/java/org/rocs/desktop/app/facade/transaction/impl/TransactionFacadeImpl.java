package org.rocs.desktop.app.facade.transaction.impl;

public class TransactionFacadeImpl {
    public Customer getCustomer(String name) {

        return customerDao.getCustomerByName(name);

    }

        for (Transaction t : transactions) {

            transactionDao.saveTransaction(t);

        }

    }

}
}
