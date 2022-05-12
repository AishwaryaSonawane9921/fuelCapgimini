class Student
{
  private  String fname;
  private  String lname;
  private  int cyear;
  private String major;
  
  public void setFname(String fname)
  
  {
   this.fname=fname;
  }
  public void setLname(String lname)
  {
   this.lname=lname;
  }
  public void setCyear(int cyear)
  {
   this.cyear=cyear;
   
  }
  public void setMajor(String major)
  {
   this.major=major;
  }
  public String getFname()
  {
    return fname;
  }
  public String getLname()
  {
   return lname;
  }
  public int getCyear()
  {
   return cyear;
  }
  public String getMajor()
  {
   return major;
  }
}
class FuelDemo1
{
   public static void main(String args)     
   { 
   Student t1=new Student();
     Student t2=new Student();
      
      t1.setFname("Aish");
      t1.setLname("Sonawane");
      t1.setCyear(2010);
      t1.setMajor("ETC");
      t1.getFname();
      t1.getLname();
      t1.getCyear();
      t1.getMajor();
      
       t2.setFname("abc");
      t2.setLname("xyz");
      t2.setCyear(2000);
      t2.setMajor("cse");
      System.out.println(t1.getFname());
      System.out.println(t1.getLname());
     System.out.println( t1.getCyear());
      System.out.println(t1.getMajor());

      
   }
}