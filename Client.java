import inheritanceDemo.CarConnection;

public class Client {
    public static void main(String args[]){
        CarConnection connection=new Mahindra();
        String conn= connection.getcar();
        System.out.println(conn);
    }

}
