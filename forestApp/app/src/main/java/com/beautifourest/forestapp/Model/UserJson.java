package com.beautifourest.forestapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/* 유저 클래스 */
public class UserJson implements Serializable {
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("pw")
    @Expose
    private String pw;
    @SerializedName("uname")
    @Expose
    private String uname;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "UserJson{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", uid='" + uid + '\'' +
                ", pw='" + pw + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}
