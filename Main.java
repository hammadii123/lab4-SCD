class RollNumberTable extends Thread {
    @Override
    public void run() {
        String[] rollNumbers = {
            "2019-SE-002", "2019-SE-093", "2019-SE-094", "2019-SE-095", "2019-SE-096"
        };
        System.out.println("Roll Numbers:");
        for (String rollNumber : rollNumbers) {
            System.out.println(rollNumber);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class BirthDateTable extends Thread {
    @Override
    public void run() {
        String[] birthDates = {
            "05-April", "12-June", "23-July", "15-September", "29-November"
        };
        System.out.println("Birth Dates:");
        for (String date : birthDates) {
            System.out.println(date);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RollNumberTable table1 = new RollNumberTable();
        BirthDateTable table2 = new BirthDateTable();
        table1.start();
        table2.start();
    }
}
