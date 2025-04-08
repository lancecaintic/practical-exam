package org.rocs.desktop.data.dao.items.impl;
import org.rocs.desktop.data.dao.customer.CustomerDao;

public class ItemDaoImpl implements ItemDao {


    public class ItemDaoImpl implements ItemDao {

        private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

        private static final String DB_USER = "your_username";

        private static final String DB_PASSWORD = "your_password";


        public Item getItemById(String itemId) {

            Item item = null;

            String sql = "SELECT * FROM items WHERE item_id = ?";


            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

                 PreparedStatement stmt = conn.prepareStatement(sql)) {


                stmt.setString(1, itemId);

                ResultSet rs = stmt.executeQuery();


                if (rs.next()) {

                    item = new Item();

                    item.setItemId(rs.getString("item_id"));

                    item.setDescription(rs.getString("description"));

                    item.setUnitPrice(rs.getDouble("unit_price"));

                }

            } catch (SQLException e) {

                e.printStackTrace();

            }

            return item;

        }

    }