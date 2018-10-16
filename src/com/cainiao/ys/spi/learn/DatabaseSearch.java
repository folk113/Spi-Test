package com.cainiao.ys.spi.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piguanghua on 4/13/18.
 */
public class DatabaseSearch  implements Search{
    public List<String> searchDoc(String keyword) {
        System.out.println("数据搜索 "+keyword);
        return new ArrayList<String>();
    }
}
