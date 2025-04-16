/*package pattern;
public class Pattern{  
		public static void main(String[] args) {
			getPattern();
			
			check();
			ForLoopStatements.check();
			pattern();
		}
		
		public static void check() {
			for(int i=0;i<10;i++) { 
				
			}
		}
		
		public static void pattern() {
			Pattern.check();
			System.out.println("");
			int n=5;
			for (int i = n - 1; i >= 0; i--) {
			
				for (int j = n - 1; j > i; j--) {
					System.out.print(" ");
				}				
				
				System.out.print("*");
			
				for (int j = 1; j < (i * 2); j++) {
					System.out.print(" ");
				}

				if (i >= 1) {
					System.out.print("*");
				}
				System.out.println();
			
		}
		}
		
		 public static void getPattern(int n)
		    {
			 int[][] arr=new int[10][10];
			 arr[0]=new int[5];
		        for (int i=0; i<n; i++)
		        {
		
		            for (int j=n-i; j>1; j--)
		            {
		                System.out.print(" ");
		            }
		  
		            for (int j=0; j<=i; j++ )
		            {
		                System.out.print("* ");
		            }
		  
		            // ending line after each row
		            System.out.println();
		        }
		    }
		     

		
		
	     public static void getPattern(){  
	    int matrix[][]=new int[10][10];  
	    int j=0;
	    int k=0;
	    int i=0;
	    int direction=1;  
	    
	       
	     
	    for(i=1;i<=100;i++){
	        matrix[j][k]=i;  
	          
	       if(direction==1){  
	          if(k+1<10){  
	                        if(matrix[j][k+1]==0){  
	                            k++;   
	                            continue;  
	                        }  
	                        else{  
	                              
	                            j++;   
	  
	                            direction=2;  
	                            continue;  
	                        } 
	                    }  
	                     
	                   else{  
	                        j++;     
	                        direction=2;  
	                        continue;  
	                    }  
	       }
	              
	              
	              
	              
	          if(direction==2) {if(j+1<10){  
	                          
	                        if(matrix[j+1][k]==0){  
	                            j++;    
	                            continue;  
	                        }  //inner if
	                        else{  
	                            direction=3;  
	                            k--;     
	                            continue;  
	                        }  
	                    }  
	                    else{  
	                            direction=3;  
	                            k--;    
	                            continue;  
	                        }  
	          }
	                     
	              
	              
	              
	          if(direction==3) {if(k-1>=0){  
	                        if(matrix[j][k-1]==0){  
	                              
	                            k--;   
	                            continue;  
	                        }  
	                        else{  
	                            direction=4;  
	                            j--;  
	                            continue;  
	                        }  
	                    }  
	                    else{  
	                            direction=4;  
	                            j--;    
	                            continue;  
	                        }  
	          }
	                      
	                      
	              
	              
	              
	          if(direction==4) {if(j-1>=0){  
	                        if(matrix[j-1][k]==0){  
	                              
	                            j--;    
	                            continue;  
	                        }  
	                        else{  
	                            k++;    
	                            direction=1;  
	                            continue;  
	                        }  
	                    }  
	                    else{  
	                            k++;   
	                            direction=1;  
	                            continue;  
	                        }  
	          }
	                      
	                     
	              
	    }
	   
	        System.out.println("Matrix after snake=\n");  
	     for(i=0;i<10;i++){  
	        for(j=0;j<10;j++){      
	          System.out.print(matrix[i][j]+"\t");   
	        }  
	        System.out.println("");  
	    }  
	      

	      
	}  
	}
*/