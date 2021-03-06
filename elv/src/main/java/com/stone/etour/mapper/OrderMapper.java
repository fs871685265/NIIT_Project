package com.stone.etour.mapper;

import com.stone.etour.bean.Order;
import com.stone.etour.bean.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int deleteByPrimaryKey(Integer oId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    Order selectByPrimaryKey(Integer oId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_order
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int updateByPrimaryKey(Order record);
}