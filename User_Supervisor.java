class User_Supervisor {
    private String username;
    private String password;
    //private Boolean status;
    private String role = "Supervisor";
   // private static WhereIsToilet IamSuperv = new WhereIsToilet("somying","321","Supervisor");
    public User_Supervisor(String username, String password) {
        this.username = username;
        this.password = password;
        //this.status = true;

    }
     public User_Supervisor(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public static void TerminateAdmin(User_Admin ad){
        ad.setRole("NotAdmin");
    }
/*
    public static void main(String[] args) {
       

    }*/
}

