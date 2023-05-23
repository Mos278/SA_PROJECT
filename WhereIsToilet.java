import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsToilet {
    Scanner sc = new Scanner(System.in);
    DB_Main db_Main = new DB_Main();
    User_Admin ad = new User_Admin("somchai","123","Admin");

    WhereIsToilet(AssessLocation location) {
        CreateDB(location);
        if (CheckInDoor(location.UserCoordinate)) {// InDoor
            InDoor MainLocation = new InDoor(location);
            CaseInDoor(MainLocation);
        } else {// OutDoor
            OutDoor MainLocation = new OutDoor(location);
            CaseOutDoor(MainLocation);
        }
    }

    WhereIsToilet(String username,String password,String role ){
        
    }

    private void CaseInDoor(InDoor location) {
        ShowBuilding(db_Main.getBuilding());
        
    }

    private void ShowBuilding(ArrayList<Building> BuildingList) {// InDoor
        for (Building b : BuildingList) {
            int i = 1;
            System.out.printf(i++ + ") ");
            System.out.println(b);
        }
        System.out.printf("select Building : ");
        int SetBuilding = sc.nextInt();
        System.out.println(" \nYou choose " + db_Main.getBuilding().get(SetBuilding-1));
        System.out.printf("select Level Max = " + db_Main.getBuilding().get(SetBuilding-1).getMaxLevel() + " Select : ");
        int SetLevel = sc.nextInt();
        System.out.println("Show Toilet : ");
         
        
    }

    
    public void ShowToilet() {
        //System.out.println(db_Main.gettoilet_list().toString());
    }

    private void CaseOutDoor(OutDoor location) {
        History H1 = new History("H1", location.UserCoordinate);
        // H1.PrintTest();
        // setDB

        // setDB
    }

    private boolean CheckInDoor(float[] location) {// simple test

        while (true) {
            System.out.println("Are you in the building? (y/n)");
            String input = sc.nextLine();

            if (input.equals("y") || input.equals("Y")) {// Yes = InDoor

                return true;

            } else if (input.equals("n") || input.equals("N")) {// No = OutDoor

                return false;

            }
            // again
            System.out.println("enter the information again.");

        }
    }

    private void CreateDB(AssessLocation location){//ไม่ต้องมี

        float[] FB1 = {2f,10f};
        float[] FT1 = {3f,1f};
        float[] FT2 = {4f,1f};
        float[] FT3 = {2f,10f};
        
        Toilet t3 = new Toilet("T003",FT3,"toilet3","picture/toilet3.jpg",null, 1);
        Building B1 = new Building(FB1,"B001","KMITL_CS","picture/Building1.jpg",t3,1,4);

        Map m1 = new Map(FB1,"picture/Map1.jpg");
        Toilet t1 = new Toilet("T001",FT1,"toilet1","picture/toilet1.jpg",null, 0);
        Toilet t2 = new Toilet("T002",FT2,"toilet2","picture/toilet2.jpg",null, 0);
        t3.setbuilding(B1);
        
        Notification n1 = new Notification("N001", t1, LocalDateTime.now(), "picture/toilet4.jpg");
        
        db_Main.update(B1);
        db_Main.update(m1);
        db_Main.update(t1);
        db_Main.update(t2);
        db_Main.update(t3);
        db_Main.update(n1);

    }
    public DB_Main getDB_Main() {
        return this.db_Main;
    }
   public User_Admin getUser_Admin() {
        return this.ad;
    }
}
