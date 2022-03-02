package cvmaker;
public class detail
{
    personal p;
    education e;
    professional pf;
    achievement ac;
    project pr;
    hobbies hb;
    void adddetail(String name,String dob,String contact,String email,String address)
    {
        p=new personal(name,dob,contact,email,address);
    }
    void adddetail(String t0,String t1,String t2,String t3,String tw0,String tw1,String tw2,String tw3,String g0,String g1,String g2,String g3)
    {
        e=new education(t0,t1,t2,t3,tw0,tw1,tw2,tw3,g0,g1,g2,g3);
    }
    void adddetail(int x,String c1,String d1,String c2,String d2,String e)
    {
        pf=new professional(c1,d1,c2,d2,e);
    }
    void adddetail(String p,String s)
    {
        pr=new project(p,s);
    }
    void adddetail(String h)
    {
        hb=new hobbies(h);
    }
    void adddetail(int x,String a,String e)
    {
        ac=new achievement(a,e);
    }
}
class achievement
{
    String academic,extra;
    achievement(String a,String e)
    {
        academic=a;
        extra=e;
    }
}
class personal
{
    String name,dob,contact,email,address;
    personal(String name,String dob,String contact,String email,String address)
    {
        this.name=name;
        this.contact=contact;
        this.address=address;
        this.email=email;
        this.dob=dob;
    }
    
}
class education
{
    String tenth[];
    String twelve[];
    String graduate[];
    education(String t0,String t1,String t2,String t3,String tw0,String tw1,String tw2,String tw3,String g0,String g1,String g2,String g3)
    {
        tenth=new String[4];
        twelve=new String[4];
        graduate=new String[4];
        tenth[0]=t0;
        tenth[1]=t1;
        tenth[2]=t2;
        tenth[3]=t3;
        twelve[0]=tw0;
        twelve[1]=tw1;
        twelve[2]=tw2;
        twelve[3]=tw3;
        graduate[0]=g0;
        graduate[1]=g1;
        graduate[2]=g2;
        graduate[3]=g3;
    }
}
class professional
{
    String course1,course2,detail1,detail2,experience;
    professional(String c1,String d1,String c2,String d2,String e)
    {
        course1=c1;
        detail1=d1;
        course2=c2;
        detail2=d2;
        experience=e;
    }
}
class project
{
    String projects;
    String skill;
    project(String p,String s)
    {
        projects=p;
        skill=s;
    }
}
class hobbies
{
    String hobby;
    hobbies(String h)
    {
        hobby=h;
    }
}