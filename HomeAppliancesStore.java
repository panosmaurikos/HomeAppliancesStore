public class HomeAppliancesStore {
   static String eteria;
   static String dieuthinsi;
   static int ergazomenoi;
   ///////////////////////getter kai setter//////////////////////////////
public void seteteria(String neweteria){
    eteria=neweteria;
}
public  String  geteteria(){
      return eteria;
    }
    public  void setDieuthinsi(String newdieuthinsi){
    dieuthinsi=newdieuthinsi;
        }
    public  String getDieuthinsi() {
        return dieuthinsi;
    }
    public void setErgazomenoi(int newergazomenoi){
    ergazomenoi=newergazomenoi;
    }
    public int getErgazomenoi(){
    return ergazomenoi;
    }
//////////////////////////////////////////////////////////////////////////
    public static void main(String[]arg){
      try {
          eteria = arg[0];
          dieuthinsi = arg[1];
          ergazomenoi = Integer.parseInt(arg[2]);
      }catch (Exception e){
          if (eteria == null) {
              System.out.println("eteria=null");
          }
          if (dieuthinsi == null) {
              System.out.println("dieuthinsi=null");
          }
      }
try{
          System.out.println(arg[0]);
          System.out.println(arg[1]);
         System.out.println(arg[2]);
      } catch(Exception e) {
       System.out.println(arg[3]);
      }
  }
}
