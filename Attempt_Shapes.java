package mi_project;

public class Attempt_Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(7);

	}
	
	public static void process(int size) {
        // TODO -- add your code here
        //Creating the first line
        dashNumber(size);
        if (size==1){
            System.out.print("|<>|\n");
        }
        else if (size==2) {
        	bodyshape(size);
        }
        else if (size==4) {
        	bodyshape(size);
        }
        else {
        	bodyshape(size);
        }
        //Creating the las line
        dashNumber(size);
    }

    // TODO -- add any helper methods here
    //This method is for creating a +---+
    public static void dashNumber(int size){
        for (int i = 1;i<=(size*2)+2;i++){
            if (i==1||i==(size*2)+2){
                System.out.print("+");
                if (i==(size*2)+2){
                	System.out.print("\n");
                }
            }
            else {
            	System.out.print("-");
            }

        }

    }
    //This Method is just to make the center line |<-->| o |<===>|
    public static void halfLine(int size){
        for (int i = 1;i<=(size*2)+2;i++){
            if (i==1||i==(size*2)+2){
            	System.out.print("|");
                if (i==(size*2)+2){
                	System.out.print("\n");
                }
            }
            else if (i==2){
            	System.out.print("<");
            }
            else if (i==(size*2)+1){
            	System.out.print(">");
            }
            else {
               if (size == 7){
            	   System.out.print("=");
               }
               else {
            	   System.out.print("-");
               }
            }
        }

    }
    // This method is for creating the rest of the shape's body. |  /\  |
    public static void bodyshape(int size){
        int count1 = 5;
        if(size==2){
        	System.out.print("| /\\ |\n");
            //This is the half line
            halfLine(size);
            System.out.print("| \\/ |\n");
        }
        else if(size==4){
            //This is for the top part
            for (int j=0; j<3;j++){
                for (int i = 1;i<=(size*2)+2;i++){
                    if (j==0){
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1) {
                        	System.out.print("/");

                        }
                        else if (i==count1+1) {
                        	System.out.print("\\");
                        }
                        else {
                        	System.out.print(" ");
                        }
                    }
                    else if (j==1){
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1-1) {
                        	System.out.print("/");

                        }
                        else if (i==count1+2) {
                        	System.out.print("\\");
                        }

                        else {
                            if (i==count1||i==count1+1){
                            	System.out.print("-");
                            }
                            else {
                            	System.out.print(" ");
                            }

                        }

                    }

                    else {
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                    
                        else if (i==count1-2) {
                        	System.out.print("/");

                        }
                        else if (i==count1+3) {
                        	System.out.print("\\");
                        }
                        else {
                            if (i>count1-2&&i<count1+3){
                            	System.out.print("=");
                            }
                            else {
                            	System.out.print(" ");
                        }
                    }
                }
            }
            }
            //This is the half line
            halfLine(size);
            //This is for the bottom part
            for (int j=2; j>=0;j--){
                for (int i = 1;i<=(size*2)+2;i++){
                    if (j==0){
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1) {
                        	System.out.print("\\");

                        }
                        else if (i==count1+1) {
                        	System.out.print("/");
                        }
                        else {
                        	System.out.print(" ");
                        }
                    }
                    else if (j==1){
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1-1) {
                        	System.out.print("\\");

                        }
                        else if (i==count1+2) {
                        	System.out.print("/");
                        }
                        else {
                            if (i==count1||i==count1+1){
                            	System.out.print("-");
                            }
                            else {
                            	System.out.print(" ");
                            }

                        }
                    }
                    else {
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1-2) {
                        	System.out.print("\\");

                        }
                        else if (i==count1+3) {
                        	System.out.print("/");
                        }
                        else {
                            if (i>count1-2&&i<count1+3){
                            	System.out.print("=");
                            }
                            else {
                            	System.out.print(" ");
                            }
                        }
                    }
                }
            }
        }
        //This is for seven size
        else {
        	count1=8;
        	//This is for the top part
            for (int j=0; j<6;j++){
                for (int i = 1;i<=(size*2)+2;i++){
                    if (j==0){
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1) {
                        	System.out.print("/");

                        }
                        else if (i==count1+1) {
                        	System.out.print("\\");
                        }
                        else {
                        	System.out.print(" ");
                        }
                    }
                    else if (j==1){
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1-1) {
                        	System.out.print("/");

                        }
                        else if (i==count1+2) {
                        	System.out.print("\\");
                        }

                        else {
                            if (i==count1||i==count1+1){
                            	System.out.print("-");
                            }
                            else {
                            	System.out.print(" ");
                            }

                        }

                    }

                    else if (j==2){
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                    
                        else if (i==count1-2) {
                        	System.out.print("/");

                        }
                        else if (i==count1+3) {
                        	System.out.print("\\");
                        }
                        else {
                            if (i>count1-2&&i<count1+3){
                            	System.out.print("=");
                            }
                            else {
                            	System.out.print(" ");
                        }
                    }
                }
                    else if(j==3) {
                    	if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                    
                        else if (i==count1-3) {
                        	System.out.print("/");

                        }
                        else if (i==count1+4) {
                        	System.out.print("\\");
                        }
                        else {
                            if (i>count1-3&&i<count1+4){
                            	System.out.print("-");
                            }
                            else {
                            	System.out.print(" ");
                        }
                            }
                    	}
                    else if(j==4) {
                    	if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                    
                        else if (i==count1-4) {
                        	System.out.print("/");

                        }
                        else if (i==count1+5) {
                        	System.out.print("\\");
                        }
                        else {
                            if (i>count1-4&&i<count1+5){
                            	System.out.print("=");
                            }
                            else {
                            	System.out.print(" ");
                        }
                            }
                    }
                    else {if (i==1||i==(size*2)+2){
                    	System.out.print("|");
                        if (i==(size*2)+2){
                        	System.out.print("\n");
                        }
                    }
                
                    else if (i==count1-5) {
                    	System.out.print("/");

                    }
                    else if (i==count1+6) {
                    	System.out.print("\\");
                    }
                    else {
                        if (i>count1-5&&i<count1+6){
                        	System.out.print("-");
                        }
                        else {
                        	System.out.print(" ");
                    }
                        }}
            }
            }
            //This is the half line
            halfLine(size);
            //This is for the bottom part
            for (int j=5; j>=0;j--){
                for (int i = 1;i<=(size*2)+2;i++){
                    if (j==0){
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1) {
                        	System.out.print("\\");

                        }
                        else if (i==count1+1) {
                        	System.out.print("/");
                        }
                        else {
                        	System.out.print(" ");
                        }
                    }
                    else if (j==1){
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1-1) {
                        	System.out.print("\\");

                        }
                        else if (i==count1+2) {
                        	System.out.print("/");
                        }
                        else {
                            if (i==count1||i==count1+1){
                            	System.out.print("-");
                            }
                            else {
                            	System.out.print(" ");
                            }

                        }
                    }
                    else if (j==2) {
                   	 if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1-2) {
                        	System.out.print("\\");

                        }
                        else if (i==count1+3) {
                        	System.out.print("/");
                        }
                        else {
                            if (i>count1-2&&i<count1+3){
                            	System.out.print("=");
                            }
                            else {
                            	System.out.print(" ");
                            }
                        }
                   }

                    else if (j==3) {
                   	 if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1-3) {
                        	System.out.print("\\");

                        }
                        else if (i==count1+4) {
                        	System.out.print("/");
                        }
                        else {
                            if (i>count1-3&&i<count1+4){
                            	System.out.print("-");
                            }
                            else {
                            	System.out.print(" ");
                            }
                        }
                   }

                    else if (j==4) {
                    	 if (i==1||i==(size*2)+2){
                         	System.out.print("|");
                             if (i==(size*2)+2){
                             	System.out.print("\n");
                             }
                         }
                         else if (i==count1-4) {
                         	System.out.print("\\");

                         }
                         else if (i==count1+5) {
                         	System.out.print("/");
                         }
                         else {
                             if (i>count1-4&&i<count1+5){
                             	System.out.print("=");
                             }
                             else {
                             	System.out.print(" ");
                             }
                         }
                    }
                    else {
                        if (i==1||i==(size*2)+2){
                        	System.out.print("|");
                            if (i==(size*2)+2){
                            	System.out.print("\n");
                            }
                        }
                        else if (i==count1-5) {
                        	System.out.print("\\");

                        }
                        else if (i==count1+6) {
                        	System.out.print("/");
                        }
                        else {
                            if (i>count1-5&&i<count1+6){
                            	System.out.print("-");
                            }
                            else {
                            	System.out.print(" ");
                            }
                        }
                    }
                }
            }
          
        }

    }
}
