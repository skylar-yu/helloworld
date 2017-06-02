package com.oneplus.test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/26.
 */
public class HellowWorld222 {
    private String name;
    private Integer age;
    private boolean flag;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void method(){
        Date d = null;
        try {
            d = df.parse("2017-06-02 16:58:33");
        } catch (ParseException e) {

        }
        System.out.println(d);
    }

    public static void  main(String [] args){
        new HellowWorld222().method();
        DateFormat df2 = new SimpleDateFormat("hfasfda");

    }
/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HellowWorld222 that = (HellowWorld222) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return age != null ? age.equals(that.age) : that.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }*/

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HellowWorld222 that = (HellowWorld222) o;

        if (!name.equals(that.name)) return false;
        return age.equals(that.age);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }*/
}





