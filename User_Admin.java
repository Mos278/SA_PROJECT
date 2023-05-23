class User_Admin {
    private String username;
    private String password;
    private String role = "Admin";
    
    WhereIsToilet IamAdmin = new WhereIsToilet("somchai","123","Admin");
    public User_Admin(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public User_Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
  class User_Admin {
    private String username;
    private String password;
    private String role = "Admin";

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

}

    


    public void ManageDB() {
       
        IamAdmin.getDB_Main();
        
    }

  
}
