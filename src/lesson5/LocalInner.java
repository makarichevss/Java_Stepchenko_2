/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson5;

public class LocalInner {

}

class Math {
	public void getResult(){
		class Division {
			private int a;
			private int b;

			public int getA() {
				return a;
			}

			public void setA(int a) {
				this.a = a;
			}

			public int getB() {
				return b;
			}

			public void setB(int b) {
				this.b = b;
			}
		}
	}
}

