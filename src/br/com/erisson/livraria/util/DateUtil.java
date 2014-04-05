package br.com.erisson.livraria.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public Date parseDate(){
		Calendar calend = Calendar.getInstance();
		Date date = calend.getTime();
		return date;
	}
}
