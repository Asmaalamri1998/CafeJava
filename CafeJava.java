public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripcoffe = 7.0;
        double latte = 13.0;
        double cappuccino = 13.0;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";


    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.print(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(pendingMessage);

        if(isReadyOrder4){
            
            System.out.println(generalGreeting + customer4 + readyMessage +  displayTotalMessage + cappuccino);

        }
        else{
            System.out.println( generalGreeting + customer4 + pendingMessage );
        }

        System.out.println(generalGreeting + customer2 + " the total of two lattes is" +latte*2);
    
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);

        }
        else{
            System.out.println( customer2 +  pendingMessage);

        }
        System.out.println(customer3 + "please pay the difference " + (latte-dripcoffe) + "$");


    }
}
