public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        {
            int age = 16;
            if (age >= 18) {

                System.out.println("Если возраст человека равен " + age +
                        " ,то он совершеннолетний ");
            } else {
            System.out.println("Если возраст человека меньше " + age + " , то он не" +
                    " достиг совершенолетия, нужно немного подождать.");
        }

            System.out.println("Задача 2");

                int temperature = 5;
                if (temperature < 5) {
                    System.out.println("На улице " + temperature + " градусов, " +
                            "нужно надеть шапку.");
                } else {
                }
                System.out.println("На улице выше " + temperature + " градусов, " +
                        "можно идти без шапки.");
            }

                System.out.println("Задача 3");
                {
                    int speed = 60;
                    if (speed > 80) {
                        System.out.println("Если скорость больше " + speed + " км/ч, то " +
                                "придётся заплатить штраф.");
                    } if ( speed < 80){

                            System.out.println("Если скорость меньше " + speed + " км/ч, то " +
                                    "можно ездить спокойно.");
                        }

                            System.out.println("Задача 4");

                                int kindergarten=20;
                                if (kindergarten > 2 && kindergarten <= 6 ){

                                    System.out.println("Если возраст человека равен " +
                                            kindergarten + " ,то ему надо ходить в детский сад.");
                                }

                                if (kindergarten >= 7 && kindergarten <= 17 )
                                {
                                    System.out.println("Если возраст человека равен " +
                                            kindergarten + " ,то ему надо ходить в школу.");
                                }

                                if (kindergarten >= 18 && kindergarten <= 24)
                                {
                                    System.out.println("Если возраст человека равен " +
                                            kindergarten + " ,то его место в университете.");
                                }

                                if (kindergarten > 24)
                                {
                                    System.out.println("Если возраст человека больше " +
                                            kindergarten + " ,то ему надо ходить на работу.");
                                }

                                    System.out.println("Задание 5");
                    {
                        int children = 15;
                        System.out.println("Если возраст ребенка равен " + children);
                        if (children < 5) {
                            System.out.println(
                                    ", то он не может кататься на аттракционе.");
                        }

                        if (children > 5 && children < 14) {
                            System.out.println(
                                    " лет, но меньше 14 " +
                                            " ,то он может кататься только в сопровождении" +
                                            " взрослого. Если взрослого нет, то кататься нельзя.");
                        }
                        if (children > 14) {
                            System.out.println(",то " +
                                    "он может кататься без сопровождения взрослого.");
                        }
                    }
                                        System.out.println("Задача 6");
                    {
                        int posititeli = 23;
                        if (posititeli > 102) {
                            System.out.println("нет мест");
                        } else {
                            if (posititeli > 60) {
                                System.out.println("есть только стоячие места ");
                            } else {
                                System.out.println("есть сидячие и стоячие места  ");
                            }
                        }
                    }
                    System.out.println("Задача 7");{
                        int one=3,two=50,three=1,big;
                        if(one>two){
                            big=one;
                        }
                        else{
                            big=two;
                        }
                        if(big<three){
                            System.out.println(three);
                        }
                        else{
                            System.out.println(big);
                        }

                }





                                    }
                                    }
                                }













