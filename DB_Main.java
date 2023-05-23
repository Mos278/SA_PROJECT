import java.time.LocalDateTime;
import java.util.ArrayList;
class DB_Main{

    private ArrayList<Notification> noti_list;
    private ArrayList<History> history_list;
    private ArrayList<Toilet> toilet_list;
    private ArrayList<Building> buildings_list;
    private ArrayList<Map> map_list;

    DB_Main(){
        this.noti_list = new ArrayList<Notification>();
        this.history_list = new ArrayList<History>();
        this.toilet_list = new ArrayList<Toilet>();
        this.buildings_list = new ArrayList<Building>();
        this.map_list = new ArrayList<Map>();
    }

    public void update(Notification x){
        this.noti_list.add(x);
    }
    public void update(History x){
        this.history_list.add(x);
    }
    public void update(Toilet x){
        this.toilet_list.add(x);
    }
    public void update(Building x){
        this.buildings_list.add(x);
    }
    public void update(Map x){
        this.map_list.add(x);
    }


    public DB_Main GET_DB_Main(){
        return this;
    }

    public ArrayList<Building> getBuilding(){
        return this.buildings_list;
    }

    public static void main(String[] args) {
        DB_Main db = new DB_Main();

        float [] at = {0.11f, 0.21f};
        Toilet t1 = new Toilet("001",at,"toilet1","picture\\toilet1.jpg",null, 0);
        Toilet t2 = new Toilet("002",at,"toilet2","picture\\toilet2.jpg",null, 0);

        Notification n1 = new Notification("001", t1, LocalDateTime.now(), "picture\\toilet3.jpg");
        db.update(t1);
        db.update(t2);
        db.update(n1);
        System.out.println(db.toilet_list.toString()); //show toilet_list only
        System.out.println(db.toString()); //show all DB_Main
    }


    @Override
    public String toString(){
        return "Toilet = "+ this.toilet_list.toString()+"\n"+
           "History = "+ this.history_list.toString()+"\n"+
           "Notification = "+ this.noti_list.toString()+"\n"+
           "Building = "+ this.buildings_list.toString()+"\n"+
           "Map = "+ this.map_list.toString()+"\n";
    }
    /*public static void printDB(DB_Main db){
        System.out.println("Toilet = "+ db.toilet_list.toString()+"\n");
        System.out.println("History = "+ db.history_list.toString()+"\n");
        System.out.println("Notification = "+ db.noti_list.toString()+"\n");
        System.out.println("Building = "+ db.buildings_list.toString()+"\n");
        System.out.println("Map = "+ db.map_list.toString()+"\n");
    }*/
    public ArrayList<Toilet> gettoilet_list(){
        return this.toilet_list;
    }

}