package com.kyh.standard.CommonAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date 类是java写好的JavaBean类 精确到毫秒
 * 空参构造表示系统当前时间 有参构造表示指定的时间
 */
public class TimeDemo {
    public static void main(String[] args) throws ParseException {
        Date localDate = new Date();
        System.out.println(localDate);
        // 时间原点
        Date zdDate = new Date(0L);
        System.out.println(zdDate);
        // 时间原点过 1s
        zdDate.setTime(1000L);
        System.out.println(zdDate);
        // 获取当前时间的毫秒
        System.out.println(localDate.getTime());
        // 打印时间原点之后一年的时间
        Date initTime = new Date(0L);
        Long time = initTime.getTime();
        time += 1000L * 3600 * 24 * 365;
        initTime.setTime(time);
        System.out.println(initTime);

        // SimpleDateFormat类 格式化时间 解析字符串时间
        Date myDate = new Date();
        System.out.println(myDate);
        // 空参构造 默认格式 2024/3/8 16:00
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String str = simpleDateFormat.format(myDate);
        System.out.println(str);
        // 带参构造 指定输出格式
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String str2 = simpleDateFormat2.format(myDate);
        System.out.println(str2);

        // 解析时间字符串
        String birthDay = "1999年8月19日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date d1 = sdf.parse(birthDay);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf2.format(d1));

        // Calendar 日历对象 可以单独修改 获取 时间中的年月日
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.setTime(myDate);
        System.out.println(c);
        System.out.println("" + c.get(1) + " " + c.get(2) + " " + c.get(3) + " " + c.get(4));
    }
}
