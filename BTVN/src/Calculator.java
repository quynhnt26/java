public class Calculator {
    float a = 15;
    int b = 7;
    float r = 8;
    //Tính chu vi hình chữ nhật
    float cirRec(){
        float p;
        p = (a + b ) * 2;
        return p;
    }
    //Tính diện tích hình chữ nhật
    float areaRec(){
        float s = (float) a*(float) b;
        return s;
    }
    //Tính chu vi hình tròn
    double cirCir(){
        double q = 2 * r * 3.14;
        return q;
    }
    //Tính diện tích hình tròn
    double areaCir(){
        double z;
        z = r * r * 3.14;
        return z;
    }
}
