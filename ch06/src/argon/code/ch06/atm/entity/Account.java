package argon.code.ch06.atm.entity;

import java.time.LocalDate;

public class Account {
    private StringBuffer history;
    private String ID;
    private String name;
    private  double money;
    private boolean gender;//false 代表男性
    private  String password;
    private String credit;
    public Account(){
        this(null,null,0,false,null,null);
    }
    public Account(String ID, String name, double money,boolean gender,String password,String credit) {
        this.ID = ID;
        this.name = name;
        this.money = money;
        this.gender=gender;
        this.password=password;
        this.credit=credit;
        history=new StringBuffer();
        history.append("交易记录：\n");
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }

    public StringBuffer getHistory() {
        return history;
    }

    public String getCredit() {
        return credit;
    }

    public double getMoney() {
        return money;
    }
    //记录每一次的交易
    public void tradeHistory(String trade,double money){
        history.append(LocalDate.now().toString()+":"+trade+"      "+money+'\n');
    }
    @Override
    public String toString() {
        String outputgender=gender?"女":"男";
        return "账户信息" +'\n'+
                "ID=" + ID + '\n' +
                "姓名=" + name + '\n' +
                "余额=" + money +'\n'+
                "性别=" + outputgender
                ;
    }
}
