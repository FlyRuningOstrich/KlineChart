package com.icechao.klinelib.model;

import java.io.Serializable;

/*************************************************************************
 * Description   :
 *
 * @PackageName  : com.icechao.klinelib.model
 * @FileName     : IDepth.java
 * @Author       : chao
 * @Date         : 2019/4/8
 * @Email        : icechliu@gmail.com
 * @version      : V1
 *************************************************************************/
public interface IDepth extends Serializable {

    float getPrice();

    float getVol();
}
