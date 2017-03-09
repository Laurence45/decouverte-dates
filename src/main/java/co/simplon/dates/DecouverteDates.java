package co.simplon.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DecouverteDates {

	public static void main (String[] args) {
		
	}
	public boolean estInferieurDateCourante(Date date) {
        Date aujourdhui = new Date();
        return date.before(aujourdhui);
	}

	public Date construireDate(String chaineFournie) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		return df.parse(chaineFournie);
	}

	public Date augmenterDate(Date dateInitiale, int nombreJours, int nombreHeures, int nombreMinutes) {
      Calendar calendrier = Calendar.getInstance();
      calendrier.setTime(dateInitiale);
      calendrier.add(Calendar.DATE, nombreJours);
      calendrier.add(Calendar.HOUR, nombreHeures);
      calendrier.add(Calendar.MINUTE,nombreMinutes );        
      return calendrier.getTime();
		
	}

	public String formaterUneDate(Date date) {
		SimpleDateFormat formaterDate = new SimpleDateFormat("dd_MM_yyyy");
		return formaterDate.format(date);
	}
		
	public String formaterUneHeure(Date time) {
		SimpleDateFormat formaterHeure = new SimpleDateFormat("HH'h'mm'min'ss'sec'");
			return formaterHeure.format(time);
	}

	public String formaterDateEnFrancais(Date date) {
		SimpleDateFormat formaterDate = new SimpleDateFormat("EEEE DD MMMM yyyy", Locale.FRENCH);
		return formaterDate.format(date);
	}
}
