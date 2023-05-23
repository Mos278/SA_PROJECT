class Enduser{
    public static void main(String[] args){
        float[] UserCoordinate = {1.1f,5f};
        
        System.out.println(UserCoordinate);
        //OutDoor outDoor = new OutDoor(location);
        WhereIsToilet WhereIsToilet = new WhereIsToilet(UserCoordinate);
        WhereIsToilet.test();

    }
    // test


} 