package com.phubber.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.phubber.spi.provider.ISpiTest;

public class TestSpi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceLoader<ISpiTest> load = ServiceLoader.load(ISpiTest.class);
		Iterator<ISpiTest> iterator = load.iterator();
		while (iterator.hasNext()) {
			ISpiTest test = iterator.next();
			test.print();
		}
	}

}