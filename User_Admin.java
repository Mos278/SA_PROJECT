class User_Admin {
    private String username;
    private String password;
    private String role = "Admin";
    
    //WhereIsToilet IamAdmin = new WhereIsToilet("somchai","123","Admin");
    public User_Admin(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public User_Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return this.username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    



    


    public void ManageDB() {
       
        //IamAdmin.getDB_Main();
        
    }

    public static void main(String[] args) {
        User_Admin admin1 = new User_Admin("somchai","123","Admin");
        WhereIsToilet iamAdmin1 = new WhereIsToilet("somchai","123","Admin");
        iamAdmin1.AdMin_EditImage();
        //iamAdmin1.db_Main.gettoilet_list();
    }

  
}
