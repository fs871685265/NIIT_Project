package com.stone.etour.bean;

public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column etour_order.o_id
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    private Integer oId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column etour_order.o_name
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    private String oName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column etour_order.o_user
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    private String oUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column etour_order.o_simple_des
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    private String oSimpleDes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column etour_order.o_price
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    private Double oPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column etour_order.o_time
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    private String oTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column etour_order.o_id
     *
     * @return the value of etour_order.o_id
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public Integer getoId() {
        return oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column etour_order.o_id
     *
     * @param oId the value for etour_order.o_id
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public void setoId(Integer oId) {
        this.oId = oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column etour_order.o_name
     *
     * @return the value of etour_order.o_name
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public String getoName() {
        return oName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column etour_order.o_name
     *
     * @param oName the value for etour_order.o_name
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public void setoName(String oName) {
        this.oName = oName == null ? null : oName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column etour_order.o_user
     *
     * @return the value of etour_order.o_user
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public String getoUser() {
        return oUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column etour_order.o_user
     *
     * @param oUser the value for etour_order.o_user
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public void setoUser(String oUser) {
        this.oUser = oUser == null ? null : oUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column etour_order.o_simple_des
     *
     * @return the value of etour_order.o_simple_des
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public String getoSimpleDes() {
        return oSimpleDes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column etour_order.o_simple_des
     *
     * @param oSimpleDes the value for etour_order.o_simple_des
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public void setoSimpleDes(String oSimpleDes) {
        this.oSimpleDes = oSimpleDes == null ? null : oSimpleDes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column etour_order.o_price
     *
     * @return the value of etour_order.o_price
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public Double getoPrice() {
        return oPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column etour_order.o_price
     *
     * @param oPrice the value for etour_order.o_price
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public void setoPrice(Double oPrice) {
        this.oPrice = oPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column etour_order.o_time
     *
     * @return the value of etour_order.o_time
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public String getoTime() {
        return oTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column etour_order.o_time
     *
     * @param oTime the value for etour_order.o_time
     *
     * @mbggenerated Tue Dec 17 16:54:12 CST 2019
     */
    public void setoTime(String oTime) {
        this.oTime = oTime == null ? null : oTime.trim();
    }
}