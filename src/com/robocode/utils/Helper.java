package com.robocode.utils;

import java.util.Scanner;

public final class Helper {
	public final static class Random {
		public static int nextInt(int min, int max) {
			return new java.util.Random().nextInt(max - min) + min;
		}
		public static int nextInt(int max) {
			return nextInt(0, max);
		}
	}
}
