package stock.dao;

import org.apache.ibatis.annotations.Param;
import stock.beans.Account;

import java.util.List;

public interface IAccountDao {
    void insertAccount(@Param("aname") String aname,@Param("money") double money);

    void updateAccount(@Param("aname")String aname,@Param("money") double money,@Param("isBuy") boolean isBuy);

    List<Account> selectAllAccount();
}
