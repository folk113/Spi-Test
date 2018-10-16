package com.cainiao.ys.spi;

import com.cainiao.ys.spi.learn.Search;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by piguanghua on 4/13/18.
 */
public class SearchMain {
    public static void main(String[] args) {
        /**
         * 这就是因为ServiceLoader.load(Search.class)在加载某接口时，会去META-INF/services下找接口的全限定名文件，
         * 再根据里面的内容加载相应的实现类。
         */

        /**
         * spi思想 接口定义需求方，实现提供方
         * 配置文件位置： private static final String PREFIX = "META-INF/services/"; ServiceLoader定义
         */
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = s.iterator();
        while (iterator.hasNext()) {
            Search search =  iterator.next();
            search.searchDoc("hello world");
        }
    }
}
