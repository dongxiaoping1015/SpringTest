package stock.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import stock.service.BuyStockException;
import stock.service.IBuyStockService;

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

}
