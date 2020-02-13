package _java._se._starbucks;

public class Client {
    private int clientCash = 1000;
    private String clientName;

    public int getClientCash(){
        return clientCash;
    }

    public void setClientName(String newName){
        this.clientName = newName;
    }

    public String getClientName(){
        return clientName;
    }
}