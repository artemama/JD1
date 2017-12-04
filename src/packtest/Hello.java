package packtest;


public class Hello {

    public static void main(String[] args) {
	int s = 2513705;
	int sec;
	int m;
	int min, h, hours, d, day, w, week;
	sec = s % 60;
	m = (s - sec) / 60;
	min = m % 60;
	h = (m - min) / 60;
	hours = h % 24;
	d = (h - hours) / 24;
	day = d % 7;
	week = day % 7;
	w = (d - week) / 4;

	System.out.println(w + " недель " + day + " дней " + hours + " часов " + min + " минут " + sec + " секунд");

    }

}
