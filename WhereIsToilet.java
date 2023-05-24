import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsToilet {
    Scanner sc = new Scanner(System.in);
    DB_Main db_Main = new DB_Main();
    int H = 1;
    
    //User_Admin ad = new User_Admin("somchai","123","Admin");
    //User_Supervisor Superv = new User_Supervisor("somying","321","Supervisor");
    
    //Superv.TerminateAdmin(ad);

    WhereIsToilet(AssessLocation location) {
        CreateDB();//Ex case
        if (CheckInDoor(location.UserCoordinate)) {// InDoor
            InDoor MainLocation = new InDoor(location);
            CaseInDoor(MainLocation);
        } else {// OutDoor
            OutDoor MainLocation = new OutDoor(location);
            CaseOutDoor(MainLocation);
        }
    }

    WhereIsToilet(String username,String password,String role ){
        System.out.println("Welcome " + username);
    }
    WhereIsToilet(){
        CreateDB();//Ex case
    }

    public void AdMin_EditImage(){
        CreateDB();//Ex case
        while(true){
        ShowToilet();
        System.out.println("If wanting to exit, select a value other than the specified");
        System.out.println("Select Toilet : ");
        int Edit = sc.nextInt() - 1;
        if(Edit< 0|| Edit >=3)break;
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Old Image : " +db_Main.gettoilet_list().get(Edit).getpictureToilet());
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("New Image : ");
        String input = sc.next();
        db_Main.gettoilet_list().get(Edit).setpictureToilet(input);
        System.out.println();
        }
    
    }

    private void CaseInDoor(InDoor location) {
        location = ShowBuilding(db_Main.getBuilding(),location);//select Building and Floor/level
        
        History H2 = new History("H2", location.UserCoordinate);
        db_Main.update(H2);

        //location.ShowFloor();
        System.out.println("---------------------------------Image-----------------------------------");
        System.out.println("Show Map : " + location.showMap());
        System.out.println("-------------------------------------------------------------------------");

        //location.showMap(db_Main.getBuilding());
        
    }
    
    private void CaseOutDoor(OutDoor location) {
        History H1 = new History("H1", location.UserCoordinate);
        db_Main.update(H1);
        ArrayList<Toilet> toilet_list = db_Main.getToilet();
        Toilet toilet = location.CalculateRoute(toilet_list);
        String route = location.ShowRoute(toilet);
        System.out.println("---------------------------------image-----------------------------------");
        System.out.println(route);
        System.out.println("-------------------------------------------------------------------------");
        
    }

   

    private InDoor ShowBuilding(ArrayList<Building> BuildingList,InDoor location) {// InDoor2
        int i = 1;
        for (Building b : BuildingList) {
            System.out.printf(i++ + ") ");
            System.out.println(b);
            
        }
        System.out.printf("select Building : ");
        int SetBuilding = sc.nextInt();
        System.out.println(" \nYou choose " + db_Main.getBuilding().get(SetBuilding-1));
        System.out.printf("select Level Max = " + db_Main.getBuilding().get(SetBuilding-1).getMaxLevel() + " Select : ");
        int SetLevel = sc.nextInt();
        

        location.Setindoor(SetLevel, db_Main.getBuilding().get(SetBuilding-1));
        return location;
    }

    public void ShowToilet() {
        //System.out.println(db_Main.gettoilet_list().toString());
        //Toilet a = new Toilet();
        int i = 1;
        for(Toilet t: db_Main.gettoilet_list()){
            System.out.printf(i++ + ") ");
            System.out.println(t);
            
        }
        
        
        //System.out.println(" \nYou choose " + db_Main.getToilet().get(SetToilet-1));
       
        
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



    private void CreateDB(){//ไม่ต้องมี

        float[] FB1 = {2f,10f};
        float[] FT1 = {3f,1f};
        float[] FT2 = {4f,1f};
        float[] FT3 = {2f,10f};
        
        String[] ListMap_B1 = {"picture/Building1_1.jpg","picture/Building1_2.jpg","picture/Building1_3.jpg","picture/Building1_4.jpg"};
        Toilet t3 = new Toilet("T003",FT3,"toilet3","picture/toilet3.jpg",null, 1);
        Building B1 = new Building(FB1,"B001","KMITL_CS",ListMap_B1,t3,1,4);
 
        Map m1 = new Map("M001",FB1,"picture/Map1.jpg");
        Toilet t1 = new Toilet("T001",FT1,"toilet1","picture/toilet1.jpg",null, 0);
        Toilet t2 = new Toilet("T002",FT2,"toilet2","picture/toilet2.jpg",null, 0);
        t3.setbuilding(B1);
        
        Notification n1 = new Notification("N001", t1, LocalDateTime.now(), "picture/toilet4.jpg","Test");
        
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
    public void createNotification(){
        System.out.println("Do you want to notify the changes around the toilet? (y/n)");
        String input = sc.next();

        if (input.equals("y") || input.equals("Y")) {// Yes = InDoor
            System.out.println("--------------------------------------Notification----------------------------------------------");
            ShowToilet();
            System.out.printf("select Toilet : ");
            int set =  sc.nextInt();
            Toilet t = new Toilet();
            t.setToilet(db_Main.gettoilet_list().get(set-1));
            //a.setToilet(db_Main.gettoilet_list(set));
            System.out.println("enter your new picture : ");
            String newpic= sc.next();
            System.out.println("enter your Description : ");
            sc.nextLine();/*clear nextLine */
            String Description = sc.nextLine();
            Notification n2 = new Notification("N002", t, LocalDateTime.now(), newpic+".jpg",Description);
            db_Main.update(n2);
            System.out.println("Notification success :"+ n2);
        } else return;
        
        //return n2;
    }
    /*public Notification getNotification() {
        return this.db_Main;
    }*/
   /*public User_Admin getUser_Admin() {
        return this.ad;
    }*/
}
