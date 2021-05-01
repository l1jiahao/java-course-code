package argon.code.ch06.atm.entity;

import java.time.LocalDate;

public class ATM {
    private int registerplace=99;//如果有新注册的用户的话从最后一个开始覆盖
    private static ATM atm=null;//用来获取唯一一个atm的实体类
    private Account[] accounts;
    private Account currentaccount;//获取当前登录系统的账户
    private boolean registerFlag=false;//用来判断注册某一次的注册是否成功
    public static ATM getInstance(){
        if(atm==null)
            atm=new ATM();
        return atm;
    }
    public ATM(){
        this.accounts=new Account[100];
        initData();
    }
    private void initData(){//初始化一些账户
        for(int j=0;j<accounts.length;j++){
            accounts[j]=new Account(String.valueOf(LocalDate.now())+"-"+j,"李小"+j,0,false,"1234",null);
    }
    }

/*    public boolean isRegisterFlag() { //本来是用来判断是否注册过 然后可以来调用窗口让窗口关闭 现在没用
        return registerFlag;
    }

    public void setRegisterFlag(boolean registerFlag) {
        this.registerFlag = registerFlag;
    }*/

    public Account getCurrentaccount() {
        return currentaccount;
    }

    public Account[] getAccounts() {
        return accounts;
    }
//取钱
    public boolean drawMoney(double money){
        if (currentaccount.getMoney()-money>=0) {
            currentaccount.setMoney(currentaccount.getMoney() - money);
            currentaccount.tradeHistory("提现", -money);
            return true;
        }
        return false;
    }
    //存钱
    public void depositMoney(double money){
        currentaccount.setMoney(currentaccount.getMoney()+money);
        currentaccount.tradeHistory("存款",+money);
    }
    //转账
    public boolean transferMoney(Account targetaccount,double money){
        if(currentaccount.getMoney()-money>=0) {
/*        Account tragetaccount = null;//目标账户可能为空
        for(Account account:accounts){
            if (account.getID().equals(ID)){
                tragetaccount=account;
                break;
            }
        }*/ //此函数内可以不用判断account是否存在 在controller中进行输入判断
            targetaccount.setMoney(targetaccount.getMoney() + money);
            currentaccount.setMoney(currentaccount.getMoney() - money);
            targetaccount.tradeHistory("转账来自：" + currentaccount.getName(), money);
            currentaccount.tradeHistory("转账给：" + targetaccount.getName(), -money);
            return true;//代表成功
        }else return false;//代表余额不足
    }
    //确认账号
    public boolean checkAccount(String ID,String password){
        for(Account account:accounts){
            if(account.getID().equals(ID) && account.getPassword().equals(password)){
                this.currentaccount=account;//获取当前账号的信息
                return true;}
        }
        return false;
    }
    //注册账号 从末尾开始覆盖
    public void register(String ID,String name,boolean gender,String password,String credit){
        if (registerplace>0) {
            accounts[registerplace] = new Account(ID, name, 0, gender, password,credit);
            registerplace--;
        }
    }

}
