package com.orlandofrancesco;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Date;

public class DateToString {
    static String convert(Date date){
        String _date = String.valueOf(date.getDate());
        String _month = String.valueOf(date.getMonth());

        if (String.valueOf(date.getDate()).length() == 1){
            _date = "0" + date.getDate();
        }

        if (String.valueOf(date.getMonth()).length() == 1){
            _month = "0" + date.getMonth();
        }

        return _date + "/" + _month + "/" + date.getYear();
    }
}
