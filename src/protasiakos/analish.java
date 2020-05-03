
package protasiakos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arapi
 */
public class analish {
   String apant;
   String str;
   String eleg;
 
   char[] temp2;
   char [] temp3;
   
   static ArrayList<String> array =new ArrayList<String>();
   
   
    
    public void protas_analhsh() throws FileNotFoundException
    {
        System.out.println("\n");
       
        System.out.println("gia na termatisth to programma pata to 1 ");
         System.out.print("dwse ena lektiko: ");
        Scanner input = new  Scanner(System.in); 
        apant = input.nextLine();
        
        try{
            FileReader fr = new FileReader("bf.txt");
            BufferedReader br = new BufferedReader(fr);
            while((str=br.readLine()) != null)
            {
             array.add(str);   
            }
                
            array.remove(0);
            br.close();
            
            
        }
        catch (IOException e)
                {
                   System.out.println("File not found");
                }
        
         for (String k: array)
         {
             System.out.print("h array exei ");
             System.out.println(k);
             
         }
        
      while(!"1".equals(apant))
      {
          if((apant.length()>1))
          {
            apant=apant.replace("-","");  
          }
          else
          {
            apant="-"+apant;       
          }
          char[] xaraktiras_elexoy;
          xaraktiras_elexoy = apant.toCharArray();
          for(int i=0;i<xaraktiras_elexoy.length;i++)
          {
           System.out.println("Data at ["+i+"]="+xaraktiras_elexoy[i]);
           } 
           
          
          
          System.out.print("to antitheto lektiko pou edwse einai to: ");
          System.out.println(apant);
          
           
          int megethos_array = array.size();
          for(int i=0; i< array.size();i++)
          {
           String temp;   
           temp=" "+array.get(i); 
           
           temp2=temp.toCharArray(); /* wste na sygkrinoyme ta dyo char arrays metaksy toys */
           
           for(int j=0;j<temp2.length;j++)
           {
               if(xaraktiras_elexoy[0]!='-')
               {
                   if(temp2[j]=='-')
                   {
                       if(temp2[j+1]==xaraktiras_elexoy[0])
                       {
                           temp2[j+1]=' ';
                           temp2[j]=' ';
                       }
                   }
               }
               if(xaraktiras_elexoy[0]=='-')
               {
                   if(temp2[j]==xaraktiras_elexoy[1])
                   {
                       if(temp2[j-1]!='-')
                       {
                           
                           temp2[j]=' ';
                       }
                       
                   }
                   
                    
               }
           
             
           }
          int  x_e=i;
          // krataei ton xarakthra otan einai me -
           
           
           if(temp2[x_e]==' ')
           {   
               x_e++;
            
           }
          if(temp2[x_e]=='-')
          {
              x_e++;
              for(int k=0; k<temp2.length;k++)
              {
                  if(temp2[x_e]==temp2[k])
                  {
                      if(temp2[k-1]!='-')
                      {
                          temp2[k]=' ';
                          temp2[x_e]=' ';
                      }
                 
                   }
               }
         
          }
          if(temp2[x_e]!=' '|| temp2[x_e]!='-')
          {
             
              for(int k=0; k<temp2.length;k++)
              {
                  if(temp2[x_e]==temp2[k])
                  {
                       if(temp2[k]=='-')
                      {
                          temp2[k]=' ';
                          temp2[x_e]=' ';
                          temp2[k-1]=' ';
                      }
                  }
                  
                  
              }
              
          }
          
          
           
           
           
           
             String kat = String.valueOf(temp2);
        //  array.add(kat);
            System.out.println(kat+"<<<<<<<<<<<<<");
          //System.out.println(kat+"................");
           
          }
          
          
        
          
           // System.out.println(megethos_array+" <<<<<<megethos ths arraylist ");
           
          
         
          
          System.out.println("gia na termatisth to programma pata to 1 ");
         System.out.print("dwse ena lektiko: ");
              
          apant = input.nextLine();
      }
       
        
        
        
        
        
        
        
        
    }
      
    }
    
    

