public class RunBloodData {
  public static void main(String[] args) {

  Scanner input = new Scanner (System.in);
  System.out.print("Enter blood type of patient: ");
  String input1 = input.nextLine();

  System.out.print("Enter the Rhesus Factor (+ or -): ");
  String input2 = input.nextLine();
  BloodData bd = null;
  if(!StringUtils.isEmpty(input1) && !StringUtils.isEmpty(input2)) {
    bd = new BloodData(input1,input2);
  } else {
    bd = new BloodData();
  }
  bd.display();
  System.out.println(" is added to the blood bank."); 