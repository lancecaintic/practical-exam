package org.rocs.desktop.data.model;

public class Business {

    public class Item {

        private String itemId;

        private String description;

        private double unitPrice;


        public String getItemId() {

            return itemId;

        }


        public void setItemId(String itemId) {

            this.itemId = itemId;

        }


        public String getDescription() {

            return description;

        }


        public void setDescription(String description) {

            this.description = description;

        }


        public double getUnitPrice() {

            return unitPrice;

        }


        public void setUnitPrice(double unitPrice) {

            this.unitPrice = unitPrice;

        }

    }


    public class Customer {

        private String name;

        private String address;

        private String contactNumber;


        public String getName() {

            return name;

        }


        public void setName(String name) {

            this.name = name;

        }


        public String getAddress() {

            return address;

        }


        public void setAddress(String address) {

            this.address = address;

        }


        public String getContactNumber() {

            return contactNumber;

        }


        public void setContactNumber(String contactNumber) {

            this.contactNumber = contactNumber;

        }

    }

    public class Transaction {

        private int transactionNumber;

        private String itemId;

        private int quantity;

        private String customerName;

        private String date;


        public int getTransactionNumber() {

            return transactionNumber;

        }


        public void setTransactionNumber(int transactionNumber) {

            this.transactionNumber = transactionNumber;

        }


        public String getItemId() {

            return itemId;

        }


        public void setItemId(String itemId) {

            this.itemId = itemId;

        }


        public int getQuantity() {

            return quantity;

        }


        public void setQuantity(int quantity) {

            this.quantity = quantity;

        }


        public String getCustomerName() {

            return customerName;

        }


        public void setCustomerName(String customerName) {

            this.customerName = customerName;

        }


        public String getDate() {

            return date;

        }


        public void setDate(String date) {

            this.date = date;

        }

    }


// 2. DAO INTERFACES

package dao;


import model.*;

import java.util.*;


    public interface ItemDao {

        Item getItemById(String itemId);

    }


    public interface CustomerDao {

        Customer getCustomerByName(String name);

    }


    public interface TransactionDao {

        void saveTransaction(Transaction transaction);

        List<Transaction> getAllTransactions();

    }
}
