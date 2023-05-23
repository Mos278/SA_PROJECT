class History{
    private String HistoryID;
    private float [] Usercoordinate = new float[2];

    History(String HistoryID, float [] Usercoordinate){
        this.HistoryID = HistoryID;
        this.Usercoordinate = Usercoordinate;
    }

    public void PrintTest(){
        System.out.println("ID : " + HistoryID + " Usercoordinate : " + Usercoordinate[0] + " , " + Usercoordinate[1]);
    }
    @Override
    public String toString(){
        return ("ID : " + HistoryID + " Usercoordinate : " + Usercoordinate[0] + " , " + Usercoordinate[1]);
    }
}