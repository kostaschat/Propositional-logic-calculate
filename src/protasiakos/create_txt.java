/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protasiakos;

import java.io.PrintWriter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author arapi
 */
public class create_txt {
   
      Queue<String> q = new LinkedList<String>();
     
      
     int tux_arithmos;
     int p=0;
     int tux_ari_pli_lekt;
     String t_a=" ";
     char[] alphabet = "abcdefghijklmnopqestuvwxyz".toCharArray();
     String  t_a1=" ";   
     int sizeOfQueue=0;
     String temp=" ";
     String prot=" ";
     String arx_tux_ar="";
    
    public void katax() 
    {
     System.out.printf("dwse to plhthos twn protasewn: ");   
     Scanner input = new  Scanner(System.in); 
     int C = input.nextInt();
     if(C<0)
     {
       System.out.printf("prepei o arithmos na einai megaluteros tou 0: ");
       C = input.nextInt(); 
     }
     
     System.out.printf("dwse to megisto  plithos lektikwn: ");   
     int L = input.nextInt();
     System.out.println(".................................");
     System.out.println("\n");
     
     if(L<0)
     {
       System.out.printf("prepei o arithmos na einai megaluteros tou 0: ");
       L = input.nextInt(); 
     }
        
       int i=0;
       Random r = new Random();
       
       for (i=1; i<=C; i++)
  
       {
            
	  tux_ari_pli_lekt = r.nextInt(L-1) + 1;
          
   
        for(int j=0;j<tux_ari_pli_lekt;j++)
        {
             
            tux_arithmos = r.nextInt(26-1)+1;
           
             
           t_a = Character.toString(alphabet[tux_arithmos]);
           arx_tux_ar=t_a;
           p = r.nextInt(100-1)+1; 
           if (p>50)
           {
               StringBuilder buffer = new StringBuilder("-");
            
               buffer.append(t_a);
               temp=buffer.toString();
                              
               t_a=temp;
            }
           else
           {
               t_a=t_a;
           }
            System.out.print("o  arxikos tuxaios xarakthras einai: ");
           System.out.println(arx_tux_ar);
           System.out.print("me pithanothta: ");
           System.out.println(p);
         System.out.print("o tuxaios xarakthras  meta thn pithanothta einai: ");
           System.out.println(t_a);
          
         prot=prot+t_a;
        }
         q.add(prot);
          sizeOfQueue=q.size();
         
          int upa_sthn_bash=0;
         
             if (q.contains(prot))
             {
            upa_sthn_bash++;
                 
             }
         
           if(upa_sthn_bash>1)
             {
                 System.out.println("uparxei hdh auth h protash kai tha dhmiourghthei allh");
                 q.remove(prot);
                 i--;
                
                 
             }
           prot="";
             
         
          System.out.print("to megethos ths ouras einai: ");
          System.out.println(sizeOfQueue); 
          System.out.print("h oura exei tous xarakthres: ");
          System.out.println(q); 
          System.out.println("-----------------------------------------------");
         
            
        }
       
       
          PrintWriter writer = null;
          try {
              int k;
            writer = new PrintWriter("bf.txt", "UTF-8");
            writer.print(26+"\t");
            writer.print(C+"\t");
            writer.println(L);
            
            for(k=0; k<C; k++)
            {
                String fo= q.poll();
                writer.println(fo);
                
            }
            
            
            writer.close();
           
          } 
          catch (Exception ex) {
              ex.printStackTrace();
          }
       
           
      
      
                     
       }  
       
     
     
        
        
        
        
    }
    

