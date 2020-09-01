package com.icechao.klinelib.formatter;

import java.util.Date;

/*************************************************************************
 * Description   :
 *
 * @PackageName  : com.icechao.klinelib.formatter
 * @FileName     : IDateTimeFormatter.java
 * @Author       : chao
 * @Date         : 2019/4/8
 * @Email        : icechliu@gmail.com
 * @version      : V1
 *************************************************************************/

public interface IDateTimeFormatter {
    String format(Date date);
}
