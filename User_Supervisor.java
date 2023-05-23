class User_Supervisor {
    private String username;
    private String password;
    private Boolean status;

    public User_Supervisor(String username, String password) {
        this.username = username;
        this.password = password;
        this.status = true;
    }

    public static void main(String[] args) {
        // Create an instance of User_Admin
        User_Admin user = new User_Admin("example_username", "example_password");

        // Access instance variables
        System.out.println("Username: " + user.username);
        System.out.println("Password: " + user.password);
        System.out.println("Status: " + user.status);
    }
}
