public class StaticVariableMethodsConstants {
    public class Bicycle {
        
        private int cadence;
        private int gear;
        private int speed;
            
        // add an instance variable for the object ID
        private int id;
        
        // add a class variable for the
        // number of Bicycle objects instantiated
        private static int numberOfBicycles = 0;

    
    }
    public class Bicycle2 {
        
        private int cadence;
        private int gear;
        private int speed;
        private int id;
        private static int numberOfBicycles = 0;
            
        public Bicycle2(int startCadence, int startSpeed, int startGear){
            gear = startGear;
            cadence = startCadence;
            speed = startSpeed;
    
            // increment number of Bicycles
            // and assign ID number
            id = ++numberOfBicycles;
        }
    
        // new method to return the ID instance variable
        public int getID() {
            return id;
        }

    }
    
}
