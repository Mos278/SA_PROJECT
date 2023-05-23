class User_Supervisor {
    private String username;
    private String password;
    //private Boolean status;
    private String role = "Supervisor";
    WhereIsToilet IamSuperv = new WhereIsToilet("somchai","123","Supervisor");
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
    public void TerminateAdmin(User_Admin ad){
        ad.setRole("NotAdmin");
    }
    public static void main(String[] args) {
        // Create an instance of User_Supervisor

        User_Supervisor Superv = new User_Supervisor("example_username", "example_password");
        
        Superv.getUser_Admin();

        // Access instance variables
    

    }
}
