package com.stone.etour.mapper;

import com.stone.etour.bean.Tour;
import com.stone.etour.bean.TourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TourMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int countByExample(TourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int deleteByExample(TourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int insert(Tour record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int insertSelective(Tour record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    List<Tour> selectByExample(TourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    Tour selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") Tour record, @Param("example") TourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int updateByExample(@Param("record") Tour record, @Param("example") TourExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int updateByPrimaryKeySelective(Tour record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table etour_tour
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    int updateByPrimaryKey(Tour record);
}