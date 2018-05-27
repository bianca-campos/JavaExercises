package Lab4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author biancacampos
 */

public class Employees {
    ArrayList<Employee> employeeArrayList;
    ArrayList<HockeyPlayer> hockeyPlayerArrayList;
    ArrayList<Professor> professorArrayList;
    ArrayList<Parent> parentArrayList;
    ArrayList<GasStationAttendant> gasStationAttendantArrayList;

    public Employees() {
        this.employeeArrayList = new ArrayList<Employee>(20);
        this.employeeArrayList.add(new HockeyPlayer("Wayne Gretzky", 894));
        this.employeeArrayList.add(new HockeyPlayer("Who Ever", 0));
        this.employeeArrayList.add(new HockeyPlayer("Brent Gretzky", 1));
        this.employeeArrayList.add(new HockeyPlayer("Pavel Bure", 437));
        this.employeeArrayList.add(new HockeyPlayer("Jason Bourne", 0));
        this.employeeArrayList.add(new Professor("Albert Einstein", "Physics"));
        this.employeeArrayList.add(new Professor("Alan Turing", "Computer Systems"));
        this.employeeArrayList.add(new Professor("Richard Feynman", "Physics"));
        this.employeeArrayList.add(new Professor("Tim Berners-Lee", "Computer Science"));
        this.employeeArrayList.add(new Professor("Kurt Godel", "Logic"));
        this.employeeArrayList.add(new Parent("Tiger Woods", 1));
        this.employeeArrayList.add(new Parent("Super Mom", 168));
        this.employeeArrayList.add(new Parent("Lazy Larry", 20));
        this.employeeArrayList.add(new Parent("Ex Hausted", 168));
        this.employeeArrayList.add(new Parent("Super Dad", 167));
        this.employeeArrayList.add(new GasStationAttendant("Joe Smith", 10));
        this.employeeArrayList.add(new GasStationAttendant("Tony Baloney", 100));
        this.employeeArrayList.add(new GasStationAttendant("Benjamin Franklin", 100));
        this.employeeArrayList.add(new GasStationAttendant("Mary Fairy", 101));
        this.employeeArrayList.add(new GasStationAttendant("Bee See", 1));

        this.hockeyPlayerArrayList = new ArrayList<HockeyPlayer>(5);
        this.hockeyPlayerArrayList.add(new HockeyPlayer("Wayne Gretzky", 894));
        this.hockeyPlayerArrayList.add(new HockeyPlayer("Who Ever", 0));
        this.hockeyPlayerArrayList.add(new HockeyPlayer("Brent Gretzky", 1));
        this.hockeyPlayerArrayList.add(new HockeyPlayer("Pavel Bure", 437));
        this.hockeyPlayerArrayList.add(new HockeyPlayer("Jason Bourne", 0));


        this.professorArrayList = new ArrayList<Professor>(5);
        this.professorArrayList.add(new Professor("Albert Einstein", "Physics"));
        this.professorArrayList.add(new Professor("Alan Turing", "Computer Systems"));
        this.professorArrayList.add(new Professor("Richard Feynman", "Physics"));
        this.professorArrayList.add(new Professor("Tim Berners-Lee", "Computer Science"));
        this.professorArrayList.add(new Professor("Kurt Godel", "Logic"));

        this.parentArrayList = new ArrayList<Parent>(5);
        this.parentArrayList.add(new Parent("Tiger Woods", 1));
        this.parentArrayList.add(new Parent("Super Mom", 168));
        this.parentArrayList.add(new Parent("Lazy Larry", 20));
        this.parentArrayList.add(new Parent("Ex Hausted", 168));
        this.parentArrayList.add(new Parent("Super Dad", 167));

        this.gasStationAttendantArrayList = new ArrayList<GasStationAttendant>(5);
        this.gasStationAttendantArrayList.add(new GasStationAttendant("Joe Smith", 10));
        this.gasStationAttendantArrayList.add(new GasStationAttendant("Tony Baloney", 100));
        this.gasStationAttendantArrayList.add(new GasStationAttendant("Benjamin Franklin", 100));
        this.gasStationAttendantArrayList.add(new GasStationAttendant("Mary Fairy", 101));
        this.gasStationAttendantArrayList.add(new GasStationAttendant("Bee See", 1));

    }




}


