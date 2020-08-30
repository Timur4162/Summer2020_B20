package day47_Encapsulations;

public class Encapsulation {

    private long ssn = 123456789;
    private String username;

    public long getSsn(){ // to read only
        return ssn;
    }

}
