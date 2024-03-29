package com.edu19time;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class ApplTime {
    public static void main(String[] args) {
        /*-
        //Calendar c = null;
        long currentTime = System.currentTimeMillis(); // get milliseconds from 1.01.1970 0:0:0.0
        System.out.println("currentTime = " + currentTime);
        //
        Date date = new Date(currentTime);
        //Date date = new Date();
        System.out.println("default = " + date);
        //
        String myTime = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS a").format(date);
        //.format(new Date());
        System.out.println("Formatted = " + myTime);
        */
		/*-
		long currentTime = System.currentTimeMillis();
		System.out.println("currentTime = " + currentTime);
		Date date = new Date(currentTime);
		System.out.println(date); 
		*/
		/*-
        LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current LocalDateTime: " + currentDateTime);
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current LocalDate: " + currentDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current LocalTime: " + currentTime);
		*/
		/*-
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDate date1 = currentDateTime.toLocalDate();
		System.out.println("toLocalDate(): " + date1);
		Month month = currentDateTime.getMonth();
		int day = currentDateTime.getDayOfMonth();
		int seconds = currentDateTime.getSecond();
		System.out.println("Month: " + month + "  day: " + day + "  seconds: " + seconds);
		System.out.println("Month.of(month) = " + Month.of(1));
		*/
		/*-
		LocalDate currentDate = LocalDate.now();
		LocalDate date2 = currentDate
				//.withDayOfMonth(10)
				//.withMonth(4)
				.withYear(2012);
		System.out.println("with... date2: " + date2);
		//
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 15); // (2014, 12, 15)
		System.out.println("LocalDate.of ... date3: " + date3);
		//
		// 22 hour 15 minutes
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("date4: " + date4);
		*/
		/*-
		LocalDate past = LocalDate.now()
				.plusWeeks(3)
				.plus(-3, ChronoUnit.CENTURIES);
		int day = past.getDayOfMonth();
		DayOfWeek dayweek = past.getDayOfWeek();
		System.out.println("past = " + past + "  day = " + day + "  dayweek = " + dayweek);
		*/
		/*-
		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
		System.out.println("date1: " + date1); // .toString()
		//
		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id); // .toString()
		//
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);
		// System.out.println(ZoneId.getAvailableZoneIds());
		// ZoneId.getAvailableZoneIds().forEach(System.out::println);
		//
		// prints all available timezone ids
		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		ZoneId zone2 = ZoneId.of("Brazil/East");
		// ZoneRules[currentStandardOffset=+01:00]
		System.out.println("zone1.getRules() = " + zone1.getRules());
		// ZoneRules[currentStandardOffset=-03:00]
		System.out.println("zone2.getRules() = " + zone2.getRules());
		*/
		/*-
		LocalDateTime a = LocalDateTime.of(2022, 5, 04, 12, 01);
		LocalDateTime t = a.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("TemporalAdjusters.firstDayOfMonth() = " + t + "  getDayOfWeek() = " + t.getDayOfWeek());
		//
		LocalDate currentDate = LocalDate.now();
		LocalDateTime currentDateTime = LocalDateTime.now();
		// 3 years, 2 months, 1 day 
		Period period = Period.of(3, 2, 1); 
		// You can modify the values of dates using periods
		LocalDate newDate = currentDate.plus(period); 
		System.out.println("newDate add 3 years, 2 months, 1 day = " + newDate);
		LocalDateTime newDateTime = currentDateTime.minus(period);
		System.out.println("newDateTime = " + newDateTime);
		*/
		/*-
		Period period = Period.of(3, 2, 1);
		System.out.println("period = " + period);
		LocalDateTime time1 = LocalDateTime.now();
		LocalDateTime time2 = time1.minus(period);
		Duration twoHours = Duration.ofHours(2);
		System.out.println("twoHours = " + twoHours);
		Duration duration = Duration.between(time2, time1);
		System.out.println("duration = " + duration);
		*/
        // /*-
        LocalDate ofEpochDay = LocalDate.ofEpochDay(0L); // 01.01.1970
        System.out.println("ofEpochDay = " + ofEpochDay);
        //
        // From currentTimeMillis to LocalDateTime
        Instant instant = Instant.ofEpochMilli(System.currentTimeMillis());
        LocalDateTime date = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        // LocalDateTime date =
        // instant.atZone(ZoneId.of("Europe/Berlin")).toLocalDateTime();
        System.out.println("ofEpoch Time = " + date);
        //
        //
        // Get currentTimeMillis by ZoneID
        // ZoneId currentZone = ZoneId.systemDefault();
        // System.out.println("CurrentZone: " + currentZone);
        ZonedDateTime zdt = date.atZone(ZoneId.of("Europe/Helsinki"));
        long millis = zdt.toInstant().toEpochMilli();
        System.out.println("millis = \t\t\t" + millis);
        System.out.println("System.currentTimeMillis() =\t" + System.currentTimeMillis());
        //
        // Convert Date to LocalDateTime
        LocalDateTime localDate = new Date(System.currentTimeMillis()).toInstant().atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy 'at' hh:mm");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS dd.MM.yyyy"); // https://en.wikipedia.org/wiki/ISO_8601
        System.out.println("localDate.format(formatter): " + localDate.format(formatter));
        // */
    }
}
