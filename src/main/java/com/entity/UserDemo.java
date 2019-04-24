package com.entity;

public class UserDemo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_demo.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_demo.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_demo.user_id_card_no
     *
     * @mbg.generated
     */
    private String userIdCardNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_demo.user_phone
     *
     * @mbg.generated
     */
    private String userPhone;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_demo
     *
     * @mbg.generated
     */
    public UserDemo(Long id, String userName, String userIdCardNo, String userPhone) {
        this.id = id;
        this.userName = userName;
        this.userIdCardNo = userIdCardNo;
        this.userPhone = userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_demo
     *
     * @mbg.generated
     */
    public UserDemo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_demo.id
     *
     * @return the value of user_demo.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_demo.id
     *
     * @param id the value for user_demo.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_demo.user_name
     *
     * @return the value of user_demo.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_demo.user_name
     *
     * @param userName the value for user_demo.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_demo.user_id_card_no
     *
     * @return the value of user_demo.user_id_card_no
     *
     * @mbg.generated
     */
    public String getUserIdCardNo() {
        return userIdCardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_demo.user_id_card_no
     *
     * @param userIdCardNo the value for user_demo.user_id_card_no
     *
     * @mbg.generated
     */
    public void setUserIdCardNo(String userIdCardNo) {
        this.userIdCardNo = userIdCardNo == null ? null : userIdCardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_demo.user_phone
     *
     * @return the value of user_demo.user_phone
     *
     * @mbg.generated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_demo.user_phone
     *
     * @param userPhone the value for user_demo.user_phone
     *
     * @mbg.generated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }
}