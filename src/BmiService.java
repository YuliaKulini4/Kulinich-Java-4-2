import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class BmiService {
public double calculate (double weight,double height){
  double  BMI = weight / Math.pow (height, 2) ;
    return BMI;
}

}
