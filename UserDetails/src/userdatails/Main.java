package userdatails;
import java.util.*;
public class Main {
    public static void main(String[] args){
    List<UserDetails>ud=new ArrayList<>();
    UserDetails ud1=new UserDetails("Hari","Ralla","8500302872","hari.ralla@gmail.com","Nellore","Andrapradesh","India");
    UserDetails ud2=new UserDetails("Hema","Buddareddy","8500302873","hema@gmail.com","Hyderabad","Andrapradesh","India");
    UserDetails ud3=new UserDetails("Deepthi","Chintam","8500302874","deepthi@gmail.com","Kovur","Andrapradesh","India");
    UserDetails ud4=new UserDetails("Akhila","Veeramalla","7993325395","akhila@gmail.com","Hyderabad","Telangana","India");
ud.add(ud1);
ud.add(ud2);
ud.add(ud3);
ud.add(ud4);
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the ph no");
        String ph=sc.nextLine();
        Main m=new Main();
        for(UserDetails st:ud){
            if(ph.equals(st.phno)){
                System.out.println("User Details :");

                System.out.println(" Name : "+st.f_name+" "+st.l_name+"");
                System.out.println("Ph no : "+st.phno);
                System.out.println("E-mail :"+st.e_mail);
                System.out.println("City : "+st.address);
                System.out.println("State : "+st.state);
                System.out.println("Country :"+st.country);
            }

    }
}}
