import java.util.*;
class prim
{
  public static void main(String[] args)
   {   
      Scanner sc=new Scanner(System.in);
      int am[][]=new int[40][40];
      int vis[]=new int[30];
      int unvis[]=new int[30];
      int i,j,k,n,tc=0,src=0,sv,index=0;
      System.out.println("enter the no of vertices\n");
      n=sc.nextInt();
      System.out.println("enter the cost adjecency matrix\n");
      for(i=0;i<n;i++)
     {
       for(j=0;j<n;j++)
        {
         am[i][j]=sc.nextInt();
         
         }
     }  
    System.out.println("the entered the cost adjecency matrix\n");  
   for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
        {
           System.out.print(am[i][j]+" ");
           
         }
         System.out.println(" ");
    } 
   System.out.println("enter the source vertex\n");
   sv=sc.nextInt();
   vis[sv-1]=1;
  for(i=0;i<n;i++)
   {
      if(i!=sv-1)
       {
         vis[i]=0;
         unvis[i]=1;
       }  
   }   
  for(i=1;i<n;i++)
   {
      int min=999;
      for(j=0;j<n;j++)
        {
          if(vis[j]==1)
           {
             for(k=0;k<n;k++)
               {
                 if((unvis[k]==1)&&(am[j][k]!=999))
                  {
                    if(min>am[j][k])
                     {
                       min=am[j][k];
                       src=j;
                       index=k;
                      }
                  }
               }
             }
           }
         vis[index]=1;
         unvis[index]=0;
         System.out.println("add the edge from"+(src+1)+"to"+(index+1)+"\ni.e("+(src+1)+","+(index+1)+")");
         tc=tc+min;
         System.out.println("total cost of MCST is \n"+tc);
     }
 
 }              
}   
  
