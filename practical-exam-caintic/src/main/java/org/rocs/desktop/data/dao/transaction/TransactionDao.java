package org.rocs.desktop.data.dao.transaction;

public interface TransactionDao {

    private void saveTransaction(Transaction transaction);

    List<Transaction> getAllTransactions();
}
