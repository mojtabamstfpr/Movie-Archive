public class Movie {

    public String name;
    private String year;
    private int point;
    private int time;
    private boolean waching;
    private int currentmovie;

    public Movie(String name, String year, int point, int time) {
        this.name = name;
        this.year = year;
        this.point = point;
        this.time = time;
        this.waching = false;
        this.currentmovie = 0;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getyear() {
        return year;
    }

    public void setyear(String year) {
        this.year = year;
    }

    public int getpoint() {
        return point;
    }

    public void setpoint(int point) {
        this.point = point;
    }

    public int gettime() {
        return time;
    }

    public void settime(int time) {
        this.time = time;
    }

    public void introduce() {
        System.out.println(
                "\n---> " + name + " is movie publish in " + year + " with " + point + "for the duration" + time);
    }

    public void status() {
        if (waching == false) {
            System.out.println("\n--> You are not currently waching this movie");
        } else {
            System.out.println("\n--> You are in  no." + currentmovie);
        }
    }

    public void start() {
        if (waching == false) {
            waching = true;
            currentmovie = 1;
            System.out.println("\n--> Started wahcing the movie");
        } else {
            System.out.println("\n--> You are already reading this book");
        }
    }

    public void end() {
        if (waching) {
            waching = false;
            currentmovie = 0;
            System.out.println("\n--> ---  END ---");
        } else {
            System.out.println("\n--> You didnt watch this movie");
        }
    }

    public void watch(int i) {
        if (waching) {
            if (time >= currentmovie + i) {
                currentmovie += i;
                System.out.println("\n--> " + i + " min had been watch. You are now in min." + currentmovie);
            } else if (point + 1 == currentmovie + i) {
                System.out.println("\n--> you wached this movie");
                waching = false;
                currentmovie = 0;
            } else {
                System.out.println("\n-->  Try again Please");
            }
        } else {
            System.out.println("\n--> You have not started watching this movie");
        }
    }
}
