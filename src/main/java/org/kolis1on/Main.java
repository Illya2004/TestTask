package org.kolis1on;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> dates = new ArrayList<>();

        dates.add(LocalDate.of(2004, 7, 1));
        dates.add(LocalDate.of(2005, 1, 2));
        dates.add(LocalDate.of(2007, 1, 1));
        dates.add(LocalDate.of(2032, 5, 3));

        System.out.println(dateSorter.sortDates(dates));


    }
}
