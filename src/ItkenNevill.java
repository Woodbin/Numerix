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

    public double count(){
        for(int i = 0; i<polynome.size();i++){
            for(int j = polynome.size()-1; j>i;j--){
                double itken= (((x-(j-i))*polynome.get(j))-((x-j)*polynome.get(j-1)))/(j-(j-i));
                System.out.println("j: "+j+" i: "+i+" :: "+itken);
                polynome.set(j, itken);
            }
        }

        return polynome.get(polynome.size()-1);
    }


    public void fill(ArrayList<Double> values){
        polynome = new ArrayList<Double>(values);
    }

    public void setX(double newx){
        x = new Double(newx);
    }

    public void test(){
        ArrayList<Double> vals = new ArrayList<Double>(Arrays.asList(new Double(2),new Double(4),new Double(4),new Double(3),new Double(0)));
        fill(vals);
        setX(new Double(5/2));
        count();
    }

}
