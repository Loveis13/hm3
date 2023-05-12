public class Main {
    public static void main(String[] args) {
        ///task1
        int age = 19        ;
        if ( age >18) {
            System.out.println("человеку 18 или больше лет");


            int  yesminor = 18;
            int minor = 17;
            boolean minorr = minor < yesminor;
            if (minorr){
                System.out.println(" совершеннолетия еще не наступил и нужно немного подождать.");

            }
        }
        /// task2

        int coldly = 10;
        int warm = 5;
        if (4 < coldly) {
            System.out.println("На улице холодно, нужно надеть шапку");
            if (warm >= 5) {
                System.out.println( "Сегодня тепло, можно идти без шапки");
            }
        }
        /// task 3

            int speedHigh = 100;
            int speedLow = 59;
            if (60>speedLow){
                System.out.println("придется заплатить штраф");
            }
            if (speedLow <60){
                System.out.println("можно ездить спокойно");
            }

            /// task 4
        int yearSold = 14;
            if (yearSold <=2){
                System.out.println("пора спать ");
            }

            if (yearSold >= 2 && yearSold < 6){
                System.out.println("нужно ходить в детский садик ");
            }
            if (yearSold >= 7 && yearSold <18){
                System.out.println("нужно ходить в школу ");
            }
            if (yearSold >= 18 && yearSold <24){
            System.out.println("его место в универе ");
        }
            if (yearSold >= 24 && yearSold < 24){
                System.out.println("то ему пора ходить на работу");
            }
            if (yearSold >60){
                System.out.println("то он может отдахнуть");
            }
            /// task5
            if (yearSold <4){
                System.out.println("то он не может кататься на аттракционе. ");
            }
            if (yearSold >= 5 && yearSold < 14){
            System.out.println("то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
            if (yearSold >=14){
                System.out.println("то он может кататься без сопровождения взрослого.");
            }

            /// task 6

            int capacity = 102;
            int seats = 60;
            int otherPlaces = capacity - seats; /// стоячие места

            int seatsUsed = 4;
            int otherUsed = 0;
            if (seatsUsed<seats) {
                System.out.println(" есть еще " + (seats - seatsUsed) + " сидячих мест ");
            }
            if (seatsUsed<seats){
            System.out.println(" есть еще " + (seats-otherUsed) + " стоячих мест ");
        }   if (seatsUsed==seatsUsed){
            System.out.println(" сидячих мест нет ");
        }   if (otherUsed== seats){
            System.out.println(" стоячих мест нет ");
            }

            ///task 7
            int one = 101;
            int two = 106;
            int three = 104;
            if (one>two){
                if (one>three){
                    System.out.println(" максимальное число " + one);
                }else if (three>one){
                    System.out.println(" максимальное число " + three);
                } else {
                    System.out.println(" числа " + one + " и " + three + " равны ");
                }
            }else if (two>one){
                if (one>two){
                    System.out.println(" максимальное число " + two);
                }else if (three>=two){
                    System.out.println(" максимальное число " + three);
                } else {
                    System.out.println(" числа " + two + " и " + three + " равны ");
                }
            } else {
                if (one>three){
                    System.out.println(" максимальное число " + one);
                }else if (three>one){
                    System.out.println(" максимальное число " + three);
                } else {
                    System.out.println(" все числа равны ");
                }
            }
       }
}