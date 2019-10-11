package com.hsys.tea.milktea.printer;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {
	public String DateString(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String Da=dateFormat.format(date);
		return Da;
	}
	public Date StringDate(String date) throws ParseException {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date Da=dateFormat.parse(date);
		return Da;
	}
	public  String subMonth(String date,int month) throws ParseException {  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date dt = sdf.parse(date);  
        Calendar rightNow = Calendar.getInstance();  
        rightNow.setTime(dt);  
        rightNow.add(Calendar.MONTH, month);  
        Date dt1 = rightNow.getTime();  
        String reStr = sdf.format(dt1);  
        return reStr;  
    }
	public String DateStringd(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String Da=dateFormat.format(date);
		return Da;
	}
}
