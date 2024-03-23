package mi_projec

public class Attempt_Shapes {


		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//get the user input
		String sizeS =" ";
		while(!sizeS.equals("exit")) {
			System.out.println("Please insert a number to show the size shape or type \"exit\" to out ");
			sizeS = scan.next();
			if (sizeS.equals("exit")) {
				System.out.println("You are out of the program");
			}
			else {
				triangle(Integer.parseInt(sizeS));
			}
			
		}
		
	}
	
	public static void triangle(int size) {
		int addH=(size*2)+2;//Add value horizontal
		int addV=(size*2)+1;//Add value vertical
		int mycount=1;
		for (int j = 0;j<addV;j++) {
			for (int i = 0;i<addH;i++) {
				if (j==0||j==addV-1) {
					if(i==0||i==addH-1) {
						System.out.print("+");
					}
					else  {
						System.out.print("-");
					}
				}
				else if (j==size) {//it is equal to size due to the counter started in zero
					if (i==0) {
						System.out.print("|");
						}
					else if (i==1) {
						System.out.print("<");
					}
					else if (i==addH-1) {
						System.out.print("|");
					}
					else if (i==addH-2) {
						System.out.print(">");
					}
				
					else {
						if(size%2!=0) {
							System.out.print("=");
						}
						else {
							System.out.print("-");
						}
					}
					
				}
				else {//we divided the last case in two groups
					if(j<size) {
						if(i==0||i==addH-1) {
							System.out.print("|");
						}
						else if(i==size+1-j) {
							System.out.print("/");
							}
						else if(i==size+j) {
							System.out.print("\\");
							}
						else if(i>size+1-j&&i<size+j) {
							if(j%2==0) {
								System.out.print("-");
								}
							else {
								System.out.print("=");
							}
						}
						else {
							System.out.print(" ");
						}
					}
					else {
						if(i==0||i==addH-1) {
							System.out.print("|");
						}
						else if(i==j-size+1) {
							System.out.print("\\");
							}
						else if(i==size*2-mycount) {//I added a counter to control the spot.
							System.out.print("/");
							mycount++; //This increment help next else if 
							}
						else if(i>j-size+1&&i<size*2-mycount) {
							if(j%2==0) {
								System.out.print("-");
								}
							else {
								System.out.print("=");
							}
						}

						else {
							System.out.print(" ");
						}
					}
				}
				//System.out.print("*");
				if (i==addH-1) {
					System.out.println("");
				}
				
			}
		}
		
	}

}

