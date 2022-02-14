package com.example.tool;

import java.lang.IllegalArgumentException;

public class MyDate {

	private int year;
	private int month;
	private int day;

	private static String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private static String[] strDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	private static int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public MyDate(int year, int month, int day) throws IllegalArgumentException {
		setDate(year, month, day);		
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0)
			return true;
		else
			return false;
	}

	public static boolean isValidDate(int year, int month, int day) {
		boolean reCheck = true;
		if (year > 1 && year < 9999 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
			if (month == 2 && day >= 1 && day <= 28)
				reCheck = true;
			else if ((month == 4 || month == 6 || month == 9 || month == 11) && day >= 1 && day <= 30)
				reCheck = true;
			else if ((month == 1 || month == 2 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
					&& day >= 1 && day <= 30)
				reCheck = true;
		} else
			reCheck = false;
		return reCheck;
	}

	public static int getDayOfWeek(int year, int month, int day) throws IllegalArgumentException {
		int reDay = 0;
		if (isValidDate(year, month, day)) {
			int d = day;
			int mNumber = (int) ((2.6 * month) - 0.2);
			int y = year % 100;
			int c = 0;
			if (Integer.toString(year).length() > 2)
				c = Integer.parseInt(Integer.toString(year).substring(0, 2));
			int w = (d + mNumber + y + (y / 4) + (c / 4)) % 7;
			reDay = w;
		} 
		return reDay;
	}

	public void setDate(int year, int month, int day) throws IllegalArgumentException {
		if (isValidDate(year, month, day)) {
			setYear(year);
			setMonth(month);
			setDay(day);
		} else {
			throw new IllegalArgumentException("Invalid year, month, day!");
		}
	}

	public void setYear(int year) throws IllegalArgumentException {
		if (year > 0 && year <= 9999)
			this.year = year;
		else {
			throw new IllegalArgumentException("Invalid year!");
		}
	}

	public void setMonth(int month) throws IllegalArgumentException {
		if (month >= 1 && month <= 12)
			this.month = month;
		else {
			throw new IllegalArgumentException("Invalid month!");
		}
	}

	public void setDay(int day) throws IllegalArgumentException {
		int maxDay = MyDate.daysInMonths[this.month - 1];
		maxDay = ((this.month == 2 && isLeapYear(this.year)) ? 29 : maxDay);
		if(day <= maxDay){
			this.day = day;
		}else {
			throw new IllegalArgumentException("Invalid Day!");
		}
		
	}

	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

	@Override
	public String toString() {
		int dayIndex = 0;
		try {
			dayIndex = getDayOfWeek(this.year, this.month, this.day);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return String.format("%s %s %s %s", strDays[dayIndex], this.day, strMonths[this.month - 1], this.year);
	}

	public void nextDay() throws IllegalArgumentException {
		int getMonth = this.month;
		int maxDay = MyDate.daysInMonths[getMonth - 1];
		if (isLeapYear(this.year) && this.month == 2) {
			// System.out.println("If 1 : " + maxDay);
			maxDay += 1;
		}
		if (maxDay == this.day) {
			this.day = 1;
			nextMonth();
		} else {
			this.day += 1;
		}
	}

	public void nextMonth() throws IllegalArgumentException {
		if (this.month == 12) {
			nextYear();
			this.month = 1;
		} else {
			this.month += 1;
		}
	}

	public void nextYear() throws IllegalArgumentException {
		if (this.year < 9999)
			this.year += 1;
		else {
			throw new IllegalArgumentException("Year out of range!");
		}
	}

	public void previousDay() throws IllegalArgumentException {

		if (this.day == 1) {
			previousMonth();
			int maxPreviousDay = MyDate.daysInMonths[this.month - 1];
			if (this.month == 2 && isLeapYear(this.year))
				maxPreviousDay += 1;
			this.day = maxPreviousDay;
		} else {
			this.day -= 1;
		}
	}

	public void previousMonth() throws IllegalArgumentException {
		if (this.month == 1) {
			previousYear();
			this.month = 12;
		} else {
			int maxDay = MyDate.daysInMonths[this.month - 1];
			this.month -= 1;
			int previousMaxDay = MyDate.daysInMonths[this.month - 1];
			previousMaxDay = ((this.month == 2 && isLeapYear(this.year)) ? 29 : previousMaxDay);
			if (maxDay > previousMaxDay)
				this.day = previousMaxDay;
		}
	}

	public void previousYear() throws IllegalArgumentException {
		if (this.year == 1) {
			throw new IllegalArgumentException("Year out of range!");
		} else {
			int maxDay = daysInMonths[this.month - 1];
			maxDay = ((isLeapYear(this.year)) ? 29 : 28);
			if (this.month == 2 && this.day == maxDay) {
				if (isLeapYear(this.year - 1))
					this.day = 29;
				else
					this.day = 28;
				this.year -= 1;
			} else {
				this.year -= 1;
			}
		}
	}

	public static Object truncatedEquals(Object date1, Object date2, int second) {
		return null;
	}


	public static void main (String[]args){
		System.out.println(isLeapYear(1999));
		System.out.println(isLeapYear(2000));

		System.out.println(isValidDate(3, 2, 28));
		System.out.println(isValidDate(3, 2, 28));

		System.out.println(getDayOfWeek(3, 2, 28));
		//System.out.println(previousYear(isLeapYear(2000)));

	
		


		
	}

	/*private static char[] previousYear(boolean leapYear) {
		return null;
	}*/

}
