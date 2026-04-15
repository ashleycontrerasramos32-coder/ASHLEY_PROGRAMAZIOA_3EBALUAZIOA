package salbuespenak;

import java.io.Serializable;

public class Puntua implements Serializable {
	
	private int x;
	
	private int y;
	
	private static final int LIMITX=3, LIMITY=5;

	public Puntua(int x, int y) throws PuntuaRangozKanpoSalbuespena {
		super();
		if(x>LIMITX || x<-LIMITX || y>LIMITY || y<-LIMITY) {
			throw new PuntuaRangozKanpoSalbuespena();
		}
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getLimitx() {
		return LIMITX;
	}

	public static int getLimity() {
		return LIMITY;
	}

	@Override
	public String toString() {
		return "Puntua [x=" + x + ", y=" + y + "]";
	}
	

}
