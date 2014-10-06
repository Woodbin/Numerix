import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Woodbin on 5.10.2014.
 */
public class ItkenNevill {

    private ArrayList<Double> polynome = new ArrayList<Double>();
    private Double x;

    public ItkenNevill(){
    }

    public ArrayList<Double> count(){
        ArrayList<Double> newVals = new ArrayList<Double>(polynome);
         for(int i = 1; i<newVals.size();i++){
            for(int j = newVals.size()-1; j>=i;j--){
                System.out.println(j+" "+i+" :(x)o-(o)o / o  ;"+" :x-(j-i): "+(x-(j-i)));
                System.out.println(j+" "+i+" :(o)x-(o)o / o  ;"+" :get(j): "+newVals.get(j));
                System.out.println(j+" "+i+" :(o)o-(x)o / o  ;"+" :x-j: "+(x-j));
                System.out.println(j+" "+i+" :(o)o-(o)x / o  ;"+" :get(j-1): "+newVals.get(j-1));
                System.out.println(j+" "+i+" :(o)o-(o)o / x  ;"+" :j-(j-i): "+(j-(j-i)));


                double itken= (((x-(j-i))*newVals.get(j))-((x-j)*newVals.get(j - 1)))/((j-(j-i)));
                System.out.println("ITKEN "+j+" "+i+" :: "+itken);
                newVals.set(j, itken);
            }
        }

        return newVals;
    }


    public void fill(ArrayList<Double> values){
        polynome = new ArrayList<Double>(values);
    }

    public void setX(double newx){
        x = new Double(newx);
    }

    public void test(){
        ArrayList<Double> vals = new ArrayList<Double>(Arrays.asList(new Double(3),new Double(4),new Double(4),new Double(3),new Double(0)));
        fill(vals);
        setX(new Double(2.5));
        for (Double aDouble : count()) {
            System.out.println(aDouble);
        };
    }

}
