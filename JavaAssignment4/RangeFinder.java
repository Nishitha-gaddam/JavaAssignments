package JavaAssignment4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class RangeFinder {
    private SimpleDateFormat simpleDateFormat;
    private Date signUpDateParsed;
    private Date currentDateParsed;
    private String kycFormattedStartDate;
    private String kycFormattedEndDate;
    private String currentDateFormatted;

    RangeFinder() {
        this.simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    }

    public String findRange(String signUpDate, String curDate) throws Exception {
        signUpDateParsed = simpleDateFormat.parse(signUpDate);
        currentDateParsed = simpleDateFormat.parse(curDate);
        if (signUpDateParsed.after(currentDateParsed))
            return "No Range";
        else
            return getRange(signUpDateParsed, currentDateParsed);
    }

    public String getRange(Date signUpDateParsed, Date currentDateParsed) throws Exception {
        @SuppressWarnings("deprecation")
        int currentYear = currentDateParsed.getYear();
        signUpDateParsed.setYear(currentYear);
        Date kycStartDate = addDays(signUpDateParsed, -30);
        Date kycEndDate = addDays(signUpDateParsed, +30);

        kycFormattedStartDate = simpleDateFormat.format(kycStartDate);
        kycFormattedEndDate = simpleDateFormat.format(kycEndDate);
        currentDateFormatted = simpleDateFormat.format(currentDateParsed);

        if (currentDateParsed.after(kycStartDate) && currentDateParsed.before(kycEndDate))
            return kycFormattedStartDate + " " + currentDateFormatted;
        else
            return kycFormattedStartDate + " " + kycFormattedEndDate;
    }

    public Date addDays(Date date, int days) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        date = calendar.getTime();
        return date;
    }

    public static void main(String[] args) throws Exception {
        RangeFinder rangeFinder = new RangeFinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        String[] signUpDate = new String[n];
        String[] curDate = new String[n];
        int count1 = 0, count2 = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                signUpDate[count1] = sc.next();
                count1++;
            } else {
                curDate[count2] = sc.next();
                count2++;
            }
        }
        String[] range = new String[n];
        for (int i = 0; i < n; i++)
            range[i] = rangeFinder.findRange(signUpDate[i], curDate[i]);
        for (int i = 0; i < n; i++)
            System.out.println(range[i]);
    }
}
