package programs;

class ConstructorInArray {
	private int[] score;

	public void setData(int[] src) {
		this.score = src;
	}

	public int[] getScore() {

		for (int i = 0; i < this.score.length; i++) {
			System.out.println("The score is " + this.score[i]);
		}
		return score;
	}

}

public class PassingArrayInSetter {

	public static void main(String[] args) {
		int[] myScore = { 2, 5, 6, 8 };
		ConstructorInArray c = new ConstructorInArray();
		c.setData(myScore);
		c.getScore();

	}

}
