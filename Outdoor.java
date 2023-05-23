import java.util.ArrayList;
class OutDoor extends AssessLocation{
    
    OutDoor(AssessLocation location) {
        super(location.UserCoordinate);
    }
    public Toilet CalculateRoute(ArrayList<Toilet> toilets){
        int index_toilet = 0;
        for(int i = 0;i < toilets.size();i++){
            if(toilets.get(i).getBuilding().equals(null)){
                /*if(find nearby toilet){
                    index_toilet = i;
                }*/
            }
        }
        //find nearby toilet
        return toilets.get(index_toilet);
    }
    public String ShowRoute(Toilet toilet){
        
        return "ที่อยู่";
    }
    public void Printtest() {
        {
            System.out.println(UserCoordinate);
        }
    }
}
