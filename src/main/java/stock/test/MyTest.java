package stock.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import stock.beans.Account;
import stock.beans.Stock;
import stock.service.BuyStockException;
import stock.service.IBuyStockService;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    private IBuyStockService service;

    @Before
    public void before() {
        String resource = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        service = (IBuyStockService) ac.getBean("buyStockService");
    }

    @Test
    public void test01() {
        service.openAccount("张三", 10000);
        service.openStock("北京动力节点", 0);
    }

    @Test
    public void test02() {

        try {
            service.buyStock("张三", 2000, "北京动力节点", 5);
        } catch (BuyStockException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test03() {
        List<Stock> stocks = new ArrayList<>();
        stocks = service.selectAllStock();
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }

    @Test
    public void test04() {
        List<Account> accounts = new ArrayList<>();
        accounts = service.selectAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
