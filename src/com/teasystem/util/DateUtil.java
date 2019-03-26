package com.teasystem.util;

public class DateUtil {
	//时间转时间戳
	public static java.sql.Timestamp d2t(java.util.Date d) {
        if (null == d)
            return null;
        return new java.sql.Timestamp(d.getTime());
    }
 
	//时间戳转时间
    public static java.util.Date t2d(java.sql.Timestamp t) {
        if (null == t)
            return null;
        return new java.util.Date(t.getTime());
    }
    
    //sql时间转util时间
    public static java.util.Date d2d(java.sql.Date t) {
        if (null == t)
            return null;
        return new java.util.Date(t.getTime());
    }
}
