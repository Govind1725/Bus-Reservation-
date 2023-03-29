public class Bus {
    int busno;
    int capcity;
    Bus(int busno, int cap){
        this.busno = busno;
        this.capcity = cap;
    }
    public int getCapacity(){
        return capcity;
    }
    public int getBusno(){
        return busno;
    }
    public void setBusno(int busno){
        this. busno = busno;
    }
    public void setCapcity(int cap){
        capcity = cap;
    }
    public void getBusInfo(){
        System.out.println("busno : "+busno+"     "+"capcity : "+capcity);
    }
}
