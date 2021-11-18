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
	
	public final static class Console {
		private static Scanner _console;
		
		public Console() {
			_console = new Scanner(System.in);
		}
		
		public static int readInt() {
			return _console.nextInt();
		}
		public static String readLine() {
			return _console.nextLine();
		}
		
		public static void writeLine(String value) {
			System.out.println(value);
		}
		public static void write(String value) {
			System.out.print(value);
		}
	}
}
