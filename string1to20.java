/*
1. W A J P T find length of a string.                       2. W A J P T copy one string to another string. 
3. W A J P T concatenate two strings.                       4. W A J P T compare two strings 
5. W A J P T convert lowercase string to uppercase.         6. W A J P T convert uppercase string to lowercase. 
7. W A J P T toggle case of each character of a string.     8. W A J P T find total number of alphabets, digits or special character in a string. 
9. W A J P T count total number of vowels and consonants in a string. 10.W A J P T count total number of words in a string. 
11.W A J P T find reverse of a string.                       12.W A J P T check whether a string is palindrome or not. 
13.W A J P T reverse order of words in a given string.   14.W A J P T find first occurrence of a character in a given string. 
15.W A J P T find last occurrence of a character in a given string. 16.W A J P T search all occurrences of a character in given string. 
17.W A J P T count occurrences of a character in given string. 18.W A J P T find highest frequency character in a string. 
19.W A J P T find lowest frequency character in a string.      20.W A J P T count frequency of each character in a string.*/
import java.util.*;
class insertString
{
    int a[];
}
class string1to20
{
     public static void main(String args[])
     {
           Scanner sc=new Scanner(System.in);
           System.out.println("1.W A J P  to find length of a string.\n2. W A J P to copy one string to another string.\n3. W A J P  to concatenate two strings.\n4. W A J P  to compare two strings.\n5. W A J P  to convert lowercase string to uppercase.\n6. W A J P to convert uppercase string to lowercase.\n7. W A J P  to toggle case of each character of a string.\n8. W A J P  to find total number of alphabets, digits or special character in a string.\n9. W A J P to count total number of vowels and consonants in a string.\n10.W A J P  to count total number of words in a string.\n11.W A J P to find reverse of a string.\n12.W A J P to check whether a string is palindrome or not.\n13.W A J P  to reverse order of words in a given string.\n14.W A J P  to find first occurrence of a character in a given string.\n15.W A J P  to find last occurrence of a character in a given string.\n16.W A J P  to search all occurrences of a character in given string.\n17.W A J P to count occurrences of a character in given string.\n18.W A J P to find highest frequency character in a string.\n19.W A J P  to find lowest frequency character in a string.\n20.W A J P to count frequency of each character in a string.");
           System.out.println("enter  the choice");
           int choice=sc.nextInt();
           switch(choice)
           {
                case 1:
                            System.out.println("enter the string ");
                            sc.nextLine();
                            String a=sc.nextLine();
                            System.out.println("string lenth is = "+a.length());
                            break;
                case 2:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           String b=a;
                           System.out.println("String copy in another ="+b);
                           break;
               case 3:
                           System.out.println("enter the frist name");
                           sc.nextLine();
                           a=sc.nextLine();
                           System.out.println("enter the name last");
                           b=sc.nextLine();
                           String fullname=a+" "+b;
                           System.out.println("full name is ="+fullname);
                           break;
              case 4:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           System.out.println("enter the string");
                           b=sc.nextLine();
                           int count=-2;
                           for(int i=0;i<a.length();i++)
                           {
                              for(int j=0;j<b.length();j++)
                              {
                                   if(a.charAt(i)==b.charAt(j))
                                   {
                                      count++;
                                   }
                              }
                           }
                           if(count==a.length())
                           {
                               System.out.println("string is equal");
                           }
                           else 
                           {
                               System.out.println("String is not equal");
                           }
                           System.out.println("length and count="+count+" "+a.length());
                           break;
              case 5:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           b=a.toUpperCase();
                           System.out.println("uppercase string is = "+b);
                           break;
              case 6:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           b=a.toLowerCase();
                           System.out.println("Lowercase string is = "+b);
                           break;
              case 7:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           b="";
                           for(int i=0;i<a.length();i++)
                           {
                               char ch=a.charAt(i);
                              if(Character.isUpperCase(ch))
                              {
                                    b+=Character.toLowerCase(ch); 
                              }
                              else if(Character.isLowerCase(ch))
                              {
                                  b+=Character.toUpperCase(ch);
                              }
                              else
                              {
                                  b+=ch;
                              }
                           }
                           System.out.println("the toggel case String is = "+b);
                           
                           break;
              case 8:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           b="";
                           int CountNumber=0,CountLetter=0,CountSpecalCharacter=0;
                           for(int i=0;i<a.length();i++)
                           {
                               char ch=a.charAt(i);
                              if(Character.isLetter(ch))
                              {
                                     CountLetter++; 
                              }
                              else if(Character.isDigit(ch))
                              {
                                  CountNumber++;
                                
                              }
                              else
                              {
                                   CountSpecalCharacter++;
                              }
                           }
                           System.out.println("Number = "+CountNumber+" Letter = "+CountLetter+" SpecalCharacter= "+CountSpecalCharacter);
                           
                           break;
              case 9:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           b="";
                           for(int i=0;i<a.length();i++)
                           {
                              char ch=a.charAt(i);
                              if(Character.isUpperCase(ch))
                              {
                                    b+=Character.toLowerCase(ch); 
                              }
                              else if(Character.isLowerCase(ch))
                              {
                                  b+=Character.toUpperCase(ch);
                              }
                              else
                              {
                                  b+=ch;
                              }
                           }
                           System.out.println("the toggel case String is = "+b);
                           break;
               case 10:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           count=0;
                           int c=0;
                        for(int i=0;i<a.length();i++)
                        {
                          if(a.charAt(i)=='a' ||a.charAt(i)=='u' ||a.charAt(i)=='o' ||a.charAt(i)=='i' ||a.charAt(i)=='e')
                          {
                              count++;
                          } 
                          else if(a.charAt(i)>='A' && a.charAt(i)<='Z' || a.charAt(i)>='a' && a.charAt(i)<='z')
                          {
                              c++;
                          }
                       }
                         System.out.println(c+"  ="+count);
                         break;
          case 11:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           for(int i=a.length()-1;i>=0;i--)
                           {
                               System.out.print(a.charAt(i));    
                           }
                           break;
          case 12:
                           System.out.println("enter the frist name");
                           sc.nextLine();
                           a=sc.nextLine();
                           int first=0;
                           int last=a.length()-1;
                           count=0;
                           for(int i=0;i<a.length();i++)
                           {
                               if(a.charAt(first)==a.charAt(last))
                               {
                                  count++;
                               }
                               first++;
                               last--;
                           }   
                           if(count==a.length())
                           {
                                System.out.println("is palindrom "+count);
                           }
                           else
                           {
                               System.out.println(" not palindrom");
                           }
 
                           break;
              case 13:
                           System.out.println("enter the string ");
                           sc.nextLine();
                           a=sc.nextLine();
                           String words[]=a.split(" ");
                           StringBuffer sb=new StringBuffer();
                           for(int i=0;i<words.length;i++)
                           {
                               String s=words[i];
                               for(int j=(s.length()-1);j>=0;j--)
                               {
                                  sb.append(s.charAt(j));
                              } 
                             sb.append(" ");
                           }
                          a=sb.toString();             //converting to string buffer to using to string
                          System.out.println(a+""+sb);
                          break;
             case 14:
                          System.out.println("enter a string ");
                          sc.nextLine();
                          a=sc.nextLine();
                          int i=a.indexOf("bhoi");
                          System.out.println(i);           
                          break;

                default:
                            System.out.println("wrong choice");
          }      
     }
}