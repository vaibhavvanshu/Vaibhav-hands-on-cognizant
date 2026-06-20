class ConfigurationManager {

    private static ConfigurationManager instance;

    private String appName;
    private String environment;


    // Private constructor to prevent object creation from outside.
    private ConfigurationManager() {
        appName = "Employee Management System";
        environment = "Production";
    }


    // Returns the single instance of the class.
    public static ConfigurationManager getInstance() {

        if(instance == null) {
            instance = new ConfigurationManager();
        }

        return instance;
    }


    public void displayConfiguration() {
        System.out.println("Application Name: " + appName);
        System.out.println("Environment: " + environment);
    }


    public void updateEnvironment(String env) {
        environment = env;
    }
}



public class Singleton {

    public static void main(String[] args) {


        ConfigurationManager config1 = ConfigurationManager.getInstance();

        ConfigurationManager config2 = ConfigurationManager.getInstance();


        System.out.println("First Configuration:");

        config1.displayConfiguration();


        System.out.println("\nUpdating environment...\n");

        config1.updateEnvironment("Testing");


        System.out.println("Second Configuration:");

        config2.displayConfiguration();



        if(config1 == config2) {
            System.out.println("\nBoth objects are same instance");
        }
        else {
            System.out.println("\nDifferent objects created");
        }

    }
}


/*
Output:
First Configuration:
Application Name: Employee Management System
Environment: Production

Updating environment...

Second Configuration:
Application Name: Employee Management System
Environment: Testing

Both objects are same instance
*/
