package HomeWork;

public class Client {

    private String clientNumber;
    private String clientCountry;
    private int requestQuantityInDec;
    private boolean isSatisfied;

    @Override
    public String toString() {
        return "Client{" +
                "clientNumber='" + clientNumber + '\'' +
                ", clientCountry='" + clientCountry + '\'' +
                ", requestQuantityInDec=" + requestQuantityInDec +
                ", isSatisfied=" + isSatisfied +
                '}';
    }

    public Client(String clientNumber, String clientCountry, int requestQuantityInDec, boolean isSatisfied) {
        this.clientNumber = clientNumber;
        this.clientCountry = clientCountry;
        this.requestQuantityInDec = requestQuantityInDec;
        this.isSatisfied = isSatisfied;
    }

    public String getClientNumber() {
        return this.clientNumber;
    }


    public String getClientCountry() {
        return this.clientCountry;
    }


    public int getRequestQuantityInDec() {
        return this.requestQuantityInDec;
    }

    public boolean isSatisfied() {
        return this.isSatisfied;
    }

}
