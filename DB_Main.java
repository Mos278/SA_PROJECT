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

    public static void main(String[] args) {
        DB_Main db = new DB_Main();

        String idToilet = "001";
        double [] at = {0.11, 0.21};
        Toilet t1 = new Toilet("001",at,"toilet1");
    }

}