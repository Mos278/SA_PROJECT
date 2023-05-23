import java.util.ArrayList;
class OutDoor extends AssessLocation{
    
    OutDoor(AssessLocation location) {
        super(location.UserCoordinate);
    }
    public Toilet CalculateRoute(ArrayList<Toilet> toilets){
        int index_toilet = 0;
        for(int i = 0;i < toilets.size();i++){
            if(toilets.get(i).getBuilding()== null){
                /*if(find nearby toilet){
                    index_toilet = i;
                }*/
            }
        }
        //find nearby toilet
        return toilets.get(index_toilet);
    }
    public String ShowRoute(Toilet toilet){
        //ค้นหาทางไปห้องน้ำจาก Google map
        return "เส้นทางไปห้องน้ำ\n"+toilet.toString();
    }
    public void Printtest(OutDoor out) {
        {
            System.out.println(UserCoordinate);
        }
    }
    /*public static void main(String[] args) {
        float[] UserCoordinate = {0.1f, 2.0f};
        AssessLocation ass = new AssessLocation(UserCoordinate);
        OutDoor out = new OutDoor(ass);
        //Printtest(out);
    }*/
}
