public class AccountTrigger implements Trigger{
    public String Name = "name";
    public Integer count = "count";
    AccountTrigger(String n){
        this.n = n;
    }
    public void func1(String var1){
        System.debug(var1);
    }
}