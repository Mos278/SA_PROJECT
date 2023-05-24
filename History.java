class History{
    private String HistoryID;
    private float [] Usercoordinate;

    History(String HistoryID, float [] Usercoordinate){
        this.HistoryID = HistoryID;
        this.Usercoordinate = Usercoordinate;
    }

    @Override
    public String toString(){
        return ("ID : " + HistoryID + " Usercoordinate : " + Usercoordinate[0] + " , " + Usercoordinate[1]);
    }
}