package stock.dao;

import org.apache.ibatis.annotations.Param;
import stock.beans.Stock;

import java.util.List;

public interface IStockDao {
    void insertStock(@Param("sname") String sname,@Param("amount") int amount);

    void updateStock(@Param("sname")String sname,@Param("amount") int amount,@Param("isBuy") boolean isBuy);

    List<Stock> selectAllStock();
}
