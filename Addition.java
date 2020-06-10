public class Addition implements Function {

	float a, b;

	Addition(float a, float b) {
		this.a = a;
		this.b = b;
	}

	public float calculate() {
		return a + b;
	}

}