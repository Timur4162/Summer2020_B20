package day47_Encapsulations;

public class Credentials {

    public String name;
    public int age;

    public static String companyName;

    private String username;
    private String password;

    static {
        companyName = "Facebook";
    }

    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setUsername(String username){  // setter (MODIFY ONLY)  when VOID = we don't to return anything
        this.username = username;               // aim is to change the PRIVATE STRING USERNAME value
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }


}
