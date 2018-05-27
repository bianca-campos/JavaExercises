package Lab4;


import java.util.Collections;

/**
 * @author biancacampos
 */

public class Driver {
    public static void main(String[] args) {
        Employees hockey = new Employees();
        for (int i = 0; i < hockey.hockeyPlayerArrayList.size(); i++){
            System.out.println(hockey.hockeyPlayerArrayList.get(i).toString());
        }
        System.out.println();
        Collections.sort(hockey.hockeyPlayerArrayList);
        for (int i = 0; i < hockey.hockeyPlayerArrayList.size(); i++){
            System.out.println(hockey.hockeyPlayerArrayList.get(i).toString());
        }

        System.out.println();

        Employees prof = new Employees();
        for (int i = 0; i < prof.professorArrayList.size(); i++){
            System.out.println(prof.professorArrayList.get(i).toString());
        }
        System.out.println();
        Collections.sort(prof.professorArrayList);
        for (int i = 0; i < prof.professorArrayList.size(); i++){
            System.out.println(prof.professorArrayList.get(i).toString());
        }

        System.out.println();

        Employees par = new Employees();
        for (int i = 0; i < par.parentArrayList.size(); i++){
            System.out.println(par.parentArrayList.get(i).toString());
        }
        System.out.println();
        Collections.sort(par.parentArrayList);
        for (int i = 0; i < par.parentArrayList.size(); i++){
            System.out.println(par.parentArrayList.get(i).toString());
        }

        System.out.println();

        Employees attendant = new Employees();
        for (int i = 0; i < attendant.gasStationAttendantArrayList.size(); i++){
            System.out.println(attendant.gasStationAttendantArrayList.get(i).toString());
        }
        System.out.println();
        Collections.sort(attendant.gasStationAttendantArrayList);
        for (int i = 0; i < attendant.gasStationAttendantArrayList.size(); i++){
            System.out.println(attendant.gasStationAttendantArrayList.get(i).toString());
        }
    }

}
