abstract class EnergySource{
int S_ID;
String S_name;
double EnergyGenerated;
EnergySource(int S_ID,String S_name,double EnergyGenerated){
this.S_ID=S_ID;
this.S_name=S_name;
this.EnergyGenerated=EnergyGenerated;
}
abstract double cal();
void displayDetails()
{
System.out.println("Source ID:"+S_ID);
System.out.println("Source NAME:"+S_name);
System.out.println("EnergyGenerated "+" by "+S_name+":"+EnergyGenerated);
System.out.println("Energy Efficiency:"+cal()+"%");
}
}
class SolarEnergy extends EnergySource{
SolarEnergy(int S_ID,String S_name,double EnergyGenerated){
super(S_ID,S_name,EnergyGenerated);
}
@Override
double cal(){
return(EnergyGenerated/5000.0*100);
}
}
class WindEnergy extends EnergySource{
WindEnergy(int S_ID,String S_name,double EnergyGenerated){
super(S_ID,S_name,EnergyGenerated);
}
@Override
double cal(){
return(EnergyGenerated/8000.0*100);
}
}
class Main{
public static void main(String[] args){
EnergySource source;
source =new SolarEnergy(101,"Solar Panel",4000);
System.out.println("-------Solar Energy----------");
source.displayDetails();


source =new WindEnergy(102,"Wind Turbines",6500);
System.out.println("-------Wind Energy----------");
source.displayDetails();
}
}
