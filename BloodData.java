  class BloodData {
    static String bloodType;
    static String rhFactor;

    public BloodData() {
      bloodType = "O";
      rhFactor = "+";   
    }

    public BloodData(String bt, String rh) {
      bloodType = bt;
      rhFactor = rh;
    }
  
  public void display(){
      System.out.print(bloodType+rhFactor);
    }
}