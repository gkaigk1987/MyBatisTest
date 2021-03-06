package com.gk.mybatis.generator.dao;

import com.gk.mybatis.generator.po.Acount;
import com.gk.mybatis.generator.po.AcountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    int countByExample(AcountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    int deleteByExample(AcountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    int insert(Acount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    int insertSelective(Acount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    List<Acount> selectByExample(AcountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    Acount selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    int updateByExampleSelective(@Param("record") Acount record, @Param("example") AcountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    int updateByExample(@Param("record") Acount record, @Param("example") AcountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    int updateByPrimaryKeySelective(Acount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount
     *
     * @mbggenerated Sat Apr 02 17:10:24 CST 2016
     */
    int updateByPrimaryKey(Acount record);
}