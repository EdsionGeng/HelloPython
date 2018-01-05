package com.gyc;

public class Wife {

private int sex;

    public int getSex() {

        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    public static String getSexName(int sex){
        if(("0".equals(String.valueOf(sex)))){
            return "男";
        }else if("1".equals(String.valueOf(sex))){
            return "女";
        }
        return "人妖";
    }


    public static void main(String[] args){
        Wife wife=new Wife();
        wife.setSex(0);
        System.out.println(wife.getSex());
        System.out.println(getSexName(wife.getSex()));
    }
}
