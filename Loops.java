public class Loops {

    //While Loop
    class WhileDemo {
        public static void main(String[] args){
            int count = 1;
            while (count < 11) {
                System.out.println("Count is: " + count);
                count++;
            }
        }
    }

    //Do_While Loop
    class DoWhileDemo {
        public static void main(String[] args){
            int count = 1;
            do {
                System.out.println("Count is: " + count);
                count++;
            } while (count < 11);
        }
    }

    //For Loop
    class ForDemo {
        public static void main(String[] args){
             for(int i=1; i<11; i++){
                  System.out.println("Count is: " + i);
             }
        }
    }

    //Enhanced_For Loop
    class EnhancedForDemo {
        public static void main(String[] args){
             int[] numbers = 
                 {1,2,3,4,5,6,7,8,9,10};
             for (int item : numbers) {
                 System.out.println("Count is: " + item);
             }
        }
    }
}
