package packtestnfc;

public class Man {
    private int hairLength; // свойство класса

    public void setHairlength(int hairLength) {
	this.hairLength = hairLength;
    }

    public int getHairlength() {
	return hairLength;
    }

    public void grow() {
	hairLength = hairLength + 1;
    }
}
