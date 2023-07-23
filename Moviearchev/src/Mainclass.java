import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.ArrayList;
import java.util.List;

class Main {

    static void archev(Movie temp) {

        System.out.println();
        System.out.println(temp.getname() + ":");
        System.out.print(
                "1- Introduction"
                        + "\n2- Start watching"
                        + "\n3- Watch"
                        + "\n4- End watching"
                        + "\n5- Viewing status"
                        + "\n6- Edit"
                        + "\n7- Delete"
                        + "\n8- Downloud"
                        + "\n9- Share"
                        + "\n10- Like"
                        + "\n11- Exit"
                        + "\nWhat do you want to do: ");
    }

    public static void main(String[] args) {
        ArrayList<Movie> Movies = new ArrayList<Movie>();
        List<Movie> likedMovies = new ArrayList<Movie>();

        System.out.println("----------------------------------");
        System.out.println("*-* WELLCOME TO MOJTABA ARCHEV *-*");
        System.out.println("----------------------------------");

        Scanner scaner1 = new Scanner(System.in);
        Scanner scaner2 = new Scanner(System.in);
        boolean shouldbreak = false;

        while (true) {

            System.out.print("\n1> Creat new Movie"
                    + "\n2> GO To MOVIE ARCHEV"
                    + "\n3> Movie liked"
                    + "\n4> Exit"
                    + "\nEnter: ");
            int userin = scaner1.nextInt();
            System.out.println();

            switch (userin) {
                case 1:
                    System.out.print("Enter Movie name: ");
                    String name = scaner2.nextLine();
                    System.out.print("Enter Movie year: ");
                    String year = scaner2.nextLine();
                    System.out.print("Enter Movie point: ");
                    int point = scaner1.nextInt();
                    System.out.print("Enter Movie time: ");
                    int time = scaner1.nextInt();

                    Movie Object = new Movie(name, year, point, time);

                    Movies.add(Object);

                    System.out
                            .println("\n==> Movie " + Object.getname() + " published in " + Object.getyear() + " with "
                                    + Object.getpoint() + " point" + " for the duration " + Object.gettime()
                                    + " minutes added");

                    break;
                case 2:
                    System.out.println("Movie Archev: ");
                    for (int i = 0; i < Movies.size(); i++) {
                        Movie temp = new Movie(Movies.get(i).getname(), Movies.get(i).getyear(),
                                Movies.get(i).getpoint(), Movies.get(i).gettime());
                        System.out.println(i + 1 + "- " + temp.getname());
                    }
                    System.out.println(Movies.size() + 1 + "- Exit");
                    System.out.print("Enter Movie number to iteract: ");
                    int buserin = scaner1.nextInt() - 1;
                    if (buserin + 1 <= Movies.size()) {
                        Movie temp = new Movie(Movies.get(buserin).getname(), Movies.get(buserin).getyear(),
                                Movies.get(buserin).getpoint(), Movies.get(buserin).gettime());

                        while (true) {

                            archev(temp);
                            int muserin = scaner1.nextInt();
                            switch (muserin) {
                                case 1:
                                    temp.introduce();
                                    break;
                                case 2:
                                    temp.start();
                                    break;
                                case 3:
                                    System.out.print("\nHow many minutes did you watch : ");
                                    int pred = scaner1.nextInt();
                                    temp.watch(pred);
                                    break;
                                case 4:
                                    temp.end();
                                    break;
                                case 5:
                                    temp.status();
                                    break;
                                case 6:
                                    System.out.print("\n1. Movie name: " + temp.getname()
                                            + "\n2. year name: " + temp.getyear()
                                            + "\n3. Total point: " + temp.getpoint()
                                            + "\n4. Total time: " + temp.gettime()
                                            + "\nWhat do you want to change? ");
                                    int skan = scaner1.nextInt();
                                    switch (skan) {
                                        case 1:
                                            System.out.print("\nEnter new name: ");
                                            String movin = scaner2.nextLine();
                                            temp.setname(movin);
                                            System.out.println("\n--> name edited succesfully");
                                            break;
                                        case 2:
                                            System.out.print("\nEnter new year name: ");
                                            String moviy = scaner2.nextLine();
                                            temp.setyear(moviy);
                                            System.out.println("\n--> year name edited succesfully");
                                            break;
                                        case 3:
                                            System.out.print("\nEnter movie point: ");
                                            int movip = scaner1.nextInt();
                                            temp.setpoint(movip);
                                            System.out.println("\n--> Total point edited succesfully");
                                            break;
                                        case 4:
                                            System.out.print("\nEnter time your movie: ");
                                            int movit = scaner1.nextInt();
                                            temp.setpoint(movit);
                                            System.out.println("\n--> Total point edited succesfully");
                                            break;
                                        default:
                                            System.out.println("\n--> There is no choise as " + skan);
                                    }
                                    break;
                                case 7:
                                    Movies.remove(buserin);
                                    shouldbreak = true;
                                    break;
                                case 8:
                                    System.out.println("Downloud started");

                                case 9:
                                    System.out.println("\n --> LINK COPIED");

                                    break;
                                case 10:

                                    likedMovies.add(temp);
                                    System.out.println("\n--> done");

                                case 11:
                                    shouldbreak = true;
                                    break;
                                default:
                                    System.out.println("\n--> There is no choise as " + muserin);
                            }
                            if (shouldbreak)
                                break;
                        }
                        shouldbreak = false;
                    } else {
                        System.out.println("\n==> There is no choise as " + buserin + 1);
                    }

                    break;
                // case 3:
                // System.out.print("Enter Movie name or year name to search: ");
                // String search = scaner2.nextInt();
                // if (Movies == search) {
                // System.out.println("ok");
                // }

                case 3:

                    System.out.println("\n==> There is no choise as " + userin);

                case 4:
                    shouldbreak = true;
                    break;
                default:

            }

            if (shouldbreak)
                break;
        }

    }

}
