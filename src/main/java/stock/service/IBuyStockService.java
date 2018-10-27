package stock.service;

import stock.beans.Account;
import stock.beans.Stock;

import java.util.List;

public interface IBuyStockService {
    void openAccount(String aname, double money);
    void openStock(String sname, int amount);

    void buyStock(String aname, double money, String sname, int amount)
            throws BuyStockException;

    public List<Stock> selectAllStock();

    public List<Account> selectAllAccount();
}
