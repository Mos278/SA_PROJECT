import java.util.Scanner;

class Enduser{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float[] UserCoordinate = {1.1f,5f};
        
        System.out.println(UserCoordinate);
        //OutDoor outDoor = new OutDoor(location);

        AssessLocation location = new AssessLocation(UserCoordinate);
        WhereIsToilet whereIsToilet = new WhereIsToilet(location);

        whereIsToilet.createNotification();

    }
    // test


} 