package entities;

public class Logica {
	private String Xvence;
	private String Ovence;

	public Logica(String vencedor, String vencedor2) {
		super();
		this.Xvence = vencedor;
		this.Ovence = vencedor2;

	}	
	public String getXvence() {
		return Xvence;
	}
	public void setXvence(String xvence) {
		Xvence = xvence;
	}
	public String getOvence() {
		return Ovence;
	}
	public void setOvence(String ovence) {
		Ovence = ovence;
	}
	public void vencedor(int[][] tab) {	
	int x =0;	
	if (tab[0][0] == tab[0][1] & tab[0][1] == tab[0][2]) {
			x = tab[0][2];	
		}
		if (tab[1][0] == tab[1][1] & tab[1][1] == tab[1][2]) {
			x = tab[1][2];	
		}
		if (tab[2][0] == tab[2][1] & tab[2][1] == tab[2][2]) {
			x = tab[2][2];	
		}
		if (tab[0][0] == tab[1][0] & tab[1][0] == tab[2][0]) {
			x = tab[2][0];	
		}
		if (tab[0][1] == tab[1][1] & tab[1][1] == tab[2][1]) {
			x = tab[2][1];		
		}
		if (tab[0][2] == tab[1][2] & tab[1][2] == tab[2][2]) {
			x = tab[2][2];
		}
		if (tab[0][0] == tab[1][1] & tab[1][1] == tab[2][2]) {
			x = tab[2][2];
		}
		if (tab[0][2] == tab[1][1] & tab[1][1] == tab[2][0]) {
			x = tab[2][0];
		}
		if(x==1) {
			System.out.println(Xvence);System.exit(0);	
		}
		else if(x==2) {
			System.out.println(Ovence);System.exit(0);	
		}
		else {
		    x = 5;
		}
	}
}
