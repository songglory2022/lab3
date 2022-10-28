

class ListLengthChecker implements StringChecker {

  String shortString;
  
   
public void ListLengthCheck(){
   shortString="";
  

   }
   
   
   public void holdshortLength(String string){
     shortString = string;

   }
   

   @Override
    public boolean checkString(String s) { 
      if (this.shortString.length() < s.length()) {
        return true;
      }
         return false;
    }
  }