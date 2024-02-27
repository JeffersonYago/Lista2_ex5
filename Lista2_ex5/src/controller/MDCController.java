package controller;

public class MDCController {

	public MDCController() {
		super();
	}
	public int MDC (int a, int b) {
		if (a == b) {
			return a;
		}else {
		if(a > b) {
			a = a - b;
		}
		return MDC(b, a);
		}
	}
}
